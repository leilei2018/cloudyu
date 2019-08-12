package cloud.webalipay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
@Component
public class HelloServiceFallback implements HelloService{
    @Override
    public String hello() {
        return "系统忙方";
    }
}

