package com.xuanniu.business.simple.backend.impl;

import com.xuanniu.business.simple.backend.SayBackend;
import com.xuanniu.business.simple.backend.mapper.SayMapper;
import com.xuanniu.business.simple.service.domain.Message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/23.
 */
@Component
public class SayDbBackend implements SayBackend{

    @Resource
    SayMapper sayMapper;

    @Override
    public boolean say(Message message) {
        return sayMapper.storeSay(message)==1;
    }
}
