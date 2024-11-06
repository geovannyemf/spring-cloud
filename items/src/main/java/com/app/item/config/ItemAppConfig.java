package com.app.item.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ItemAppConfig {

	@Bean
	public RestTemplate registerRestTemplate() {
		return new RestTemplate();
	}
	
}
