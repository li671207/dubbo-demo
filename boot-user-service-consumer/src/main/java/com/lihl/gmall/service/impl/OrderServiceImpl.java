package com.lihl.gmall.service.impl;

import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.OrderService;
import com.lihl.gmall.service.UserService;


@Service
public class OrderServiceImpl implements OrderService {
	@Reference
	private UserService userService;

	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		
		return addressList;
		
	}

}
