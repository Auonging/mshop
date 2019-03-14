package com.skymall.shiro;

import com.skymall.cache.J2CacheUtils;
import com.skymall.dao.UserMapper;
import com.skymall.domain.User;
import com.skymall.service.impl.UserServiceImpl;
import com.skymall.utils.Constant;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 认证
 *
 * @author lipengjun
 * @date 2017年11月19日 上午9:49:19
 */
public class Realm extends AuthorizingRealm {

    @Resource
    private UserMapper userMapper;


    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        User user = (User) principals.getPrimaryPrincipal();
        Long userId = user.getId();

        List<String> permsList = (List<String>) J2CacheUtils.get(Constant.PERMS_LIST + userId);

        //用户权限列表
        Set<String> permsSet = new HashSet<String>();
        if (permsList != null && permsList.size() != 0) {
            for (String perms : permsList) {
                if (StringUtils.isBlank(perms)) {
                    continue;
                }
                permsSet.addAll(Arrays.asList(perms.trim().split(",")));
            }
        }

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(permsSet);
        return info;
    }

    /**
     * 认证(登录时调用)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
//        String username = (String) token.getPrincipal();

        //抽取token中的username和password
        User username = (User) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        //查询用户信息
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        User user = userServiceImpl.getOne(username);

        //账号不存在
        if (user.getUsername() == null) {
            throw new UnknownAccountException("账号或密码不正确");
        }

        //密码错误
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("账号或密码不正确");
        }

        //账号锁定
        if (user.getStatus() == 0) {
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        // 把当前用户放入到session中
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession(true);
        session.setAttribute(Constant.CURRENT_USER, user);

//        List<String> permsList;

        //系统管理员，拥有最高权限
//        if (Constant.SUPER_ADMIN == user.getUserId()) {
//            List<SysMenuEntity> menuList = sysMenuDao.queryList(new HashMap<String, Object>());
//            permsList = new ArrayList<>(menuList.size());
//            for (SysMenuEntity menu : menuList) {
//                permsList.add(menu.getPerms());
//            }
//        } else {
//            permsList = UserMapper.queryAllPerms(user.getUserId());
//        }
//        J2CacheUtils.put(Constant.PERMS_LIST + user.getId(), permsList);

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, getName());
        return info;
    }

}
