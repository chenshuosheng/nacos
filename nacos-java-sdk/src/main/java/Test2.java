import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/8 23:48
 */
public class Test2 {

    public static void main(String[] args) throws IOException {

        try {
            String serverAddr = "localhost:8848";
            String dataId = "test";
            String group = "DEFAULT_GROUP";

            Properties properties = new Properties();
            properties.put("serverAddr",serverAddr);
            ConfigService configService = NacosFactory.createConfigService(properties);

            //监听修改
            configService.addListener(dataId, group, new Listener() {
                @Override
                public Executor getExecutor() {
                    return null;
                }

                @Override
                public void receiveConfigInfo(String configInfo) {
                    System.out.println(configInfo);
                }
            });

        } catch (NacosException e) {
            e.printStackTrace();
        }

        System.in.read();
    }
}
