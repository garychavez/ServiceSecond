package com.everis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
@Bean(name="studentRest")
public RestTemplate resgistrarRestTemplate() {
	return new RestTemplate();
	
}
}
