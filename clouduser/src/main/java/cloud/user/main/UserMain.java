package cloud.user.main;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class UserMain {

    @GetMapping("/hello")
    public String hello(){
        return "haah";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(UserMain.class,args);
    }

    /*@Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }*/
}
