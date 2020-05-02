package com.lihl.gmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.UserService;


@Service
public class UserServiceStub implements UserService {
	@Autowired
	private final UserService userService;
	
	/**
	 * 传入UserService代理对象
	 * @param userService
	 */
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}

	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceStub.......");
		if (!StringUtils.isEmpty(userId)) {
			return userService.getUserAddressList(userId);
		}
		
		return null;
	}





}
