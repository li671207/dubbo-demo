package com.lihl.gmall.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.dubbo.config.annotation.Service;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class UserServiceImpl implements UserService {

	
	@HystrixCommand
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl......3...");
//		try {
//			TimeUnit.SECONDS.sleep(3000);//高可用，服务降级
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		UserAddress userAddress1 = new UserAddress(1,"广东深圳","001","lihl","13888888888","Y");
		UserAddress userAddress2 = new UserAddress(1,"四川成都","002","jww","13999999999","Y");
		//服务容错 Hystrix
		if (Math.random()>0.5) {
			throw new RuntimeException();
		}
		return Arrays.asList(userAddress1,userAddress2);
	}

}
