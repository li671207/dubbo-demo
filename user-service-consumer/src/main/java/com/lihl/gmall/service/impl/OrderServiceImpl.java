package com.lihl.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.OrderService;
import com.lihl.gmall.service.UserService;


@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private UserService userService;

	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		
		System.out.println(addressList);
		
		return addressList;
	}



}
