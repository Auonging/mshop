package com.skymall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.skymall.dao.TbTokenMapper;
import com.skymall.domain.TbToken;
import com.skymall.service.ITbTokenService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户Token 服务实现类
 * </p>
 *
 * @author zhaogengren123
 * @since 2019-03-04
 */
@Service
public class TbTokenServiceImpl extends ServiceImpl<TbTokenMapper, TbToken> implements ITbTokenService {

}
