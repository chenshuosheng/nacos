import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/8 23:48
 */
public class Test {

    public static void main(String[] args) {

        try {
            String serverAddr = "localhost:8848";
            String dataId = "test";
            String group = "DEFAULT_GROUP";

            Properties properties = new Properties();
            properties.put("serverAddr",serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);

            String content = configService.getConfig(dataId,group,5000);

            System.out.println(content);
        } catch (NacosException e) {
            e.printStackTrace();
        }
    }
}
