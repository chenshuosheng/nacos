package css.discovery;

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


@RestController
@RequestMapping("discovery")
public class DiscoveryController {

    @NacosInjected
    private NamingService namingService;

    //TODO: 获取到的列表始终为空，为什么

    @GetMapping(value = "/getList")
    public List<Instance> getList(@RequestParam String serviceName) throws NacosException {
        return namingService.getAllInstances(serviceName);
    }

    //TODO：结果始终为 DOWN

    @GetMapping(value = "/getStatus")
    public String getStatus() {
        return namingService.getServerStatus();
    }
}
