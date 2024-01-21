package css.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 14:04
 */

@RestController
@RequestMapping("/config")
public class ConfigController {

    //@NacosValue 是 Nacos 提供的专门用于从 Nacos 配置中心获取配置项的注解，
    //而 @Value 是 Spring 框架提供的注解，主要用于从Spring的环境配置文件（如application.properties）中读取配置项的值。
    //@Value(value = "${useLocalCache:false}")
    @NacosValue(value = "${useLocalCache:false}",autoRefreshed = true)
    private boolean useLocalCache;


    @GetMapping("/getUseLocalCache")
    public boolean getUseLocalCache(){
        return useLocalCache;
    }
}
