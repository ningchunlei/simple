package com.xuanniu;

import com.xuanniu.framework.CMWebApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2015/6/23.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BusinessSimpleWebApplication {

    public static void main(String[] args) throws InterruptedException {
        CMWebApplication.run(BusinessSimpleWebApplication.class, args);
    }

}
