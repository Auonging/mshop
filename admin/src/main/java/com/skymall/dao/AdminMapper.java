package com.skymall.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skymall.domain.Admin;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author linchusen
 * @since 2019-03-10
 */

public interface AdminMapper extends BaseMapper<Admin> {

    Admin selectOne(String wrapper, String username);
}
