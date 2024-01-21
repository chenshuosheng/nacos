package com.serviceConfig;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 0:47
 */

@Component
public class UserService {

    /*如果格式与nacos中配置不匹配，会报错*/
    /* 从Nacos中获取配置并注入到port变量中 */
    @Value("${spring.server.port}")
    private String port;

    /* 从Nacos中获取配置并注入到ip变量中，启用自动刷新 */
    @NacosValue(value = "${spring.server.ip:}", autoRefreshed = true)
    private String ip;

    public void test(){
        System.out.println("------------------------");
        System.out.println("port："+port);
        System.out.println("ip："+ip);
        System.out.println("------------------------");
    }
}
