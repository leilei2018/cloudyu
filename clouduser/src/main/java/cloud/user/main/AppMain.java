package cloud.user.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.locks.LockSupport;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class AppMain {

    @GetMapping("/hello1")
    public String hello(){
        return "haah";
    }

    public static void main(String[] args) {
        RestTemplate res;
        SpringApplication.run(AppMain.class);
    }
}
