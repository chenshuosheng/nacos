package com.serviceDiscovery;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 10:21
 */

/*
@Controller
@RestController("discovery")
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;

    @GetMapping("/get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        List<Instance> instances = namingService.getAllInstances(serviceName);
        return instances;
    }
}
*/

@RestController
@RequestMapping("discovery")
public class DiscoveryController {


    //TODO：使用@NacosInjected注入NamingService 存在问题，暂时无法解决
    //更改naocs版本解决：1.4.1-->2.0.4

    //TODO: 新问题：调用接口报错
    //@EnableNacosDiscovery(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
    //值写成了：127.0.0.8848

    @NacosInjected
    private NamingService namingService;

    @GetMapping(value = "/get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }
}
