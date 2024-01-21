package css;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: CSS
 * @Date: 2024/1/15 23:51
 */

//统一读取配置(刷新)
@RefreshScope
@Configuration
public class CloudConfiguration {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    public boolean isUseLocalCache() {
        return useLocalCache;
    }
}
