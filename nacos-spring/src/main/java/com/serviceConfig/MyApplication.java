package com.serviceConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 0:41
 */

public class MyApplication {
    public static void main(String[] args) throws IOException {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(NacosServiceConfiguration.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.test();
    }
}
