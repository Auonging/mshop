package com.skymall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.skymall.domain.Category;
import com.skymall.web.dto.requestDto.CategroyReqDto;

import java.util.List;

public interface IWcCatagoryService extends IService<Category> {

    public List<Category> selectAll(CategroyReqDto categoryReqDto);

    public List<Category> selectAllByPage(CategroyReqDto categoryReqDto, Integer offset, Integer limit);

    public Category selectById(Integer id);

    public List<Category> selectChildren(Integer parentId);
}