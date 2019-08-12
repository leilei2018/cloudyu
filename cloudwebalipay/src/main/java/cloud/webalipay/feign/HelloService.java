package cloud.webalipay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CLOUDUSER",fallback = HelloServiceFallback.class)
public interface HelloService {
    @GetMapping("/hello")
    String hello();
}

