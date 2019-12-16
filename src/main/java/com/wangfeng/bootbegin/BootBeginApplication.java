package com.wangfeng.bootbegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(locations = {"classpath:beans.xml"})
public class BootBeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBeginApplication.class, args);
    }

}
