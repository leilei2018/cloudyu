package cloud.webalipay.main;

import brave.sampler.Sampler;
import cloud.webalipay.feign.HelloService;
import cloud.webalipay.feign.PayHelloService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 此模块用feign模式调用
 * 定义的接口要是@feignclient
 */
@SpringBootApplication(scanBasePackages = "cloud.webalipay")
@RestController
@EnableFeignClients(value="cloud.webalipay.feign")
//@EnableHystrix //加载HystrixCircuitBreakerConfiguration 添加对@hystricCommand的切面
public class WebalipayMain {
    @Autowired
    HelloService helloService;

    @Autowired
    PayHelloService payHelloService;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello(){
        //String forObject = restTemplate.getForObject("http://localhost:8090/hello", String.class);
        helloService.hello();
        payHelloService.hello();
        return "success";
    }
    public static void main(String[] args) {
        SpringApplication.run(WebalipayMain.class,args);
    }

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
