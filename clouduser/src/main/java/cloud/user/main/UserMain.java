package cloud.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaServer
public class UserMain {

    @GetMapping("/hello")
    public String hello(){
        return "haah";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(UserMain.class,args);
    }
}
