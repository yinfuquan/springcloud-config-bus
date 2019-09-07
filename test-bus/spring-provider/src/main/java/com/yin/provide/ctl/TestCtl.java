package com.yin.provide.ctl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yin.
 * Date:2019/9/7
 * Time: 18:02
 */
@RestController
@RefreshScope
public class TestCtl {
    @Value("${name}")
    private  String name;
    @RequestMapping("/")
    public  String test(){
        return name;
    }

}
