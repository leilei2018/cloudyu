package cloud.web.main;

//import com.zk.edu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableFeignClients(basePackages="com.zk.edu.service")
@RestController
public class WebMain {

    //@Autowired
   //HelloService helloService;


    @GetMapping("/hello")
    public String hello(@RequestParam String name){
        String forObject = restTemplate.getForObject("http://CLOUDUSER/hello?name=kk", String.class);
        System.out.println("receive:"+forObject);
        return "hello:"+name;
    }

    @Autowired
    RestTemplate restTemplate;

    @Bean
   @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(WebMain.class);

        System.out.println(ctx.getBeansOfType(RestTemplate.class).size());

    }

}
