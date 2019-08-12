package cloud.pay.feign.clouduser;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("CLOUDUSER")
public interface UserService {

    @GetMapping("/hello")
    String hello();

}
