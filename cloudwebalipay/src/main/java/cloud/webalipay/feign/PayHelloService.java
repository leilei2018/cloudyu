package cloud.webalipay.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "CLOUDPAY")
public interface PayHelloService {
    @GetMapping("/hello")
    String hello();
}

