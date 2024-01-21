package css.config;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/9 12:20
 */


//@NacosPropertySource注解用于指定Nacos配置中心的数据ID和是否开启自动更新。
//具体地，dataId参数指定了应用程序需要从Nacos配置中心获取的配置项的ID，
//而autoRefreshed参数用于指定是否启用自动更新机制，
//即当配置中心的配置项发生变化时，应用程序是否自动刷新相应的配置项。
@NacosPropertySource(dataId = "example",autoRefreshed = true)
@SpringBootApplication
public class NacosConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(NacosConfigApplication.class,args);
    }
}
