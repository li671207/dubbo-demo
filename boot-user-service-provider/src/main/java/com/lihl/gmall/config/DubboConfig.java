package com.lihl.gmall.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {
	
	@Bean
	public ApplicationConfig applicationConfig() {
		 ApplicationConfig applicationConfig = new ApplicationConfig();
		 applicationConfig.setName("boot-user-service-provider1");
		 
		 return applicationConfig;
	}

}
