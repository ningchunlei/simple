package com.xuanniu.webapp.simple.web;

import com.xuanniu.business.simple.service.Say;
import com.xuanniu.business.simple.service.domain.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2015/6/19.
 */
@RestController
@RequestMapping(value = "/v1/api")
public class SimpleController {

    static Logger logger = LoggerFactory.getLogger(SimpleController.class);
    @Resource
    private Say sayService;

    @RequestMapping(value = "say", method = RequestMethod.GET)
    public Message say(@RequestParam(value="message") String message){
        Message m = new Message();
        m.setSay(message);
        return sayService.say(m);
    }

}
