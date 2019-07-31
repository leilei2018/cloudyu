package cloud.web.main;

import com.zk.edu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableFeignClients(basePackages="com.zk.edu.service")
public class AppMain {

    @Autowired
    HelloService helloService;

    @PostConstruct
    public String hello(){

        for (int i = 0; i < 5; i++) {
            String hello = helloService.hello();
            System.out.println("return value->"+hello);
        }
        return "";
    }

    public static void main(String[] args) {

        SpringApplication.run(AppMain.class);

    }

}
