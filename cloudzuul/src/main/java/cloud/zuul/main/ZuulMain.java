package cloud.zuul.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication(scanBasePackages = "cloud.zuul.configuration")
@EnableZuulProxy
public class ZuulMain {

    public static void main(String[] args) {
        SpringApplication.run(ZuulMain.class,args);
    }
}
