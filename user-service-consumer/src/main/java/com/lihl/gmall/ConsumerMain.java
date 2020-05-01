package com.lihl.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lihl.gmall.service.OrderService;

public class ConsumerMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		
		//测试启动时检查
//		OrderService orderService = context.getBean(OrderService.class);
//		orderService.initOrder("1");
	
		System.in.read();
	}

}
