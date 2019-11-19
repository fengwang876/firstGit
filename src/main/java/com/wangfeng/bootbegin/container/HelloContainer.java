package com.wangfeng.bootbegin.container;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloContainer {
    @RequestMapping("/hello")
    public String hello(){return "hello world";}
}
