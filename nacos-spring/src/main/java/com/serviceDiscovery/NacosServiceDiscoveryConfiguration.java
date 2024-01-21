package com.serviceDiscovery;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 10:12
 */

@Configuration
@EnableNacosDiscovery(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class NacosServiceDiscoveryConfiguration {


}
