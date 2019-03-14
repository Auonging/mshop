package com.skymall.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")

public class Admin {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private long id;

    private String username;

    private String password;

    private String email;

    private String mobile;

    /**
     * 超级管理员ID
     */
    public static final int SUPER_ADMIN = 1;

    /**
     * 权限前缀
     */
    public static final String SESSION_KEY = "SESSIONID_";

    /**
     * 权限前缀
     */
    public static final String PERMS_LIST = "permsList";
    /**

    /**
     * 当前登录用户
     */
    public static final String CURRENT_USER = "curUser";

    /**
     * 系统缓存前缀
     */
    public static final String SYS_CACHE = "SYS_CACHE:";

    private int status;

    private long create_user_id;

    private LocalDateTime create_time;

    private long dept_id;
}
