package cloud.pay.main;

import cloud.pay.ban.Welcome;
import cloud.pay.feign.clouduser.UserService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "cloud.pay.config")
@RestController
@EnableFeignClients("cloud.pay.feign")
public class PayMain {

        @Autowired
        UserService userService;
        @Autowired
        Welcome welcome;

        @GetMapping("/hello")
        public String hello(){
            userService.hello();
            return "helloPay";
        }


        @GetMapping("/env")
        public String env(){
            return welcome.getHello()+"@"+welcome.getAuthor();
}

        public static void main(String[] args) {
            new SpringApplicationBuilder(PayMain.class)

           .run(args);
        }
}
