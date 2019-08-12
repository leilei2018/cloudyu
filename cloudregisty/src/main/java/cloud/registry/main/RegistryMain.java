package cloud.registry.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableEurekaServer
public class RegistryMain {
    public static void main(String[] args) {

        new SpringApplicationBuilder(RegistryMain.class)
                .profiles("server1")

                .run(args);
    }
}
