package com.xuanniu.business.simple.service.impl;

import com.xuanniu.business.simple.backend.SayBackend;
import com.xuanniu.business.simple.service.Say;
import com.xuanniu.business.simple.service.domain.Message;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/23.
 */
@Component
public class DefaultSayService implements Say{

    @Resource
    SayBackend sayBackend;

    @Override
    public Message say(Message message) {
        sayBackend.say(message);
        return message;
    }
}
