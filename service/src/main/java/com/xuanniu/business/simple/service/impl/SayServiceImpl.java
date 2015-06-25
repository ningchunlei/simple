package com.xuanniu.business.simple.service.impl;

import com.xuanniu.business.simple.backend.SayBackend;
import com.xuanniu.business.simple.service.Say;
import com.xuanniu.business.simple.service.domain.Message;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/19.
 */
@Component
@Priority(value=10)
public class SayServiceImpl implements Say {

    @Resource
    @Qualifier("defaultSayService")
    Say say;

    @Override
    public Message say(Message message) {
        return say.say(message);
    }
}
