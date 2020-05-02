package com.lihl.gmall.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.Service;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl......3...");
		UserAddress userAddress1 = new UserAddress(1,"广东深圳","001","lihl","13888888888","Y");
		UserAddress userAddress2 = new UserAddress(1,"四川成都","002","jww","13999999999","Y");
		
		return Arrays.asList(userAddress1,userAddress2);
	}

}
