package com.skymall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skymall.dao.SpecificationMapper;
import com.skymall.domain.Specification;
import com.skymall.service.ISpecificationService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 规格表 服务实现类
 * </p>
 *
 * @author zhaogengren123
 * @since 2019-03-04
 */
@Service
public class SpecificationServiceImpl extends ServiceImpl<SpecificationMapper, Specification> implements ISpecificationService {

}
