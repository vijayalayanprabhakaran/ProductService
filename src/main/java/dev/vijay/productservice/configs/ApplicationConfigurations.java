package dev.vijay.productservice.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ApplicationConfigurations {

    @Bean
    public RestTemplate createRestTemplate(){
        return new RestTemplate();
    }
}
