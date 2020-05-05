package com.lihl.gmall;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ImportResource;



//@ImportResource(locations = "classpath:provider.xml")//保留dubbo .xml配置
@EnableDubbo
@SpringBootApplication
@EnableHystrix
public class BootProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProviderApplication.class, args);
	}

}
