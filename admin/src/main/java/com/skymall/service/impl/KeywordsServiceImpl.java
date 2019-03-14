package com.skymall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skymall.dao.KeywordsMapper;
import com.skymall.domain.Keywords;
import com.skymall.service.IKeywordsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 热闹关键词表 服务实现类
 * </p>
 *
 * @author zhaogengren123
 * @since 2019-03-04
 */
@Service
public class KeywordsServiceImpl extends ServiceImpl<KeywordsMapper, Keywords> implements IKeywordsService {

}
