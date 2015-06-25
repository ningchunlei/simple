package com.xuanniu.business.simple.backend.mapper;

import com.xuanniu.business.simple.service.domain.Message;
import com.xuanniu.framework.common.MyBatisRepository;

/**
 * Created by Administrator on 2015/6/23.
 */
@MyBatisRepository
public interface SayMapper {

    public int storeSay(Message message);

}
