package cloud.web.main;

import cloud.web.main.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
public class AppMain {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){

        String hello = helloService.hello();

        return hello;
    }

    public static void main(String[] args) {

        SpringApplication.run(AppMain.class);

    }

}
