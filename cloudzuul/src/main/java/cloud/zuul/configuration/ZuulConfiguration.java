package cloud.zuul.configuration;

import cloud.zuul.service.fallback.SystemErrorFallbackProvider;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZuulConfiguration {
    @Bean
    public FallbackProvider systemErrorFallbackProvider(){
        return new SystemErrorFallbackProvider();
    }
}
