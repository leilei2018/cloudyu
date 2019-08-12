package cloud.pay.main;

import cloud.pay.feign.clouduser.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
@EnableFeignClients("cloud.pay.feign")
public class PayMain {

    @Autowired
    UserService userService;

        @GetMapping("/hello")
        public String hello(){
            userService.hello();
            return "helloPay";
        }

        public static void main(String[] args) {
           SpringApplication.run(PayMain.class,args);
        }
}
