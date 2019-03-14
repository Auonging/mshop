package com.skymall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.skymall.domain.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhaogengren123
 * @since 2019-03-04
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
