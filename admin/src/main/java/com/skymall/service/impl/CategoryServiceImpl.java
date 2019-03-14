package com.skymall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skymall.dao.CategoryMapper;
import com.skymall.domain.Category;
import com.skymall.service.ICategoryService;
import com.skymall.utils.WrapperUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author linchusen
 * @since 2019-03-12
 */



@Service("Category")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Resource
    private Category category;

    @Override
    public List<Category> selectAll(Category category) {
        QueryWrapper queryWrapper = new QueryWrapper();
        WrapperUtil.wrap(queryWrapper, category);
        queryWrapper.orderByAsc("id");
        List<Category> list = categoryMapper.selectList(queryWrapper);
        return list;
    }


    /**
     * 分页查询
     * @param page
     * @return
     */
    public IPage<Category> queryByPage(Page<Category> page) {
        return categoryMapper.selectPage(page, null);

    }


}
