package css;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
//@RefreshScope注解表示该控制器所使用的配置信息可以动态刷新
//@RefreshScope
public class ConfigController {

    @Autowired
    private CloudConfiguration cloudConfiguration;

    //@Value("${useLocalCache:false}")
    //private boolean useLocalCache;

    //新增配置：dataId=服务名+'.'+文件后缀
    //http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=cloud.properties&group=DEFAULT_GROUP&content=useLocalCache=true

    @RequestMapping("/get")
    public boolean get() {
        return cloudConfiguration.isUseLocalCache();
        //return useLocalCache;
    }
}
