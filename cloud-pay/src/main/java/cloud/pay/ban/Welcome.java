package cloud.pay.ban;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
@ConfigurationProperties(prefix = "welcome", ignoreUnknownFields = true)
@Data
public class Welcome implements Serializable {

    private String hello;

    private String author;

}
