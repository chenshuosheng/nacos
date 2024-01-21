package com.serviceConfig;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 0:46
 */


/**
 * 这个类是应用程序的配置类。
 * 它启用了组件扫描和 Nacos 配置。
 */
@ComponentScan("com.serviceConfig")

/**
 * 启用 Nacos 配置并指定 Nacos 服务器地址。
 */
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))

/**
 * 加载指定数据 ID 的配置，并启用动态更新。
 */
@NacosPropertySource(dataId = "test", autoRefreshed = true)
public class NacosServiceConfiguration {

}
