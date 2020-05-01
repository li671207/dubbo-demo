package com.lihl.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableDubbo
@SpringBootApplication
public class BootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProviderApplication.class, args);
	}

}
