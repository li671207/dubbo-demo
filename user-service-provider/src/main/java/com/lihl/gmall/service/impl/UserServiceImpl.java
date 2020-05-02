package com.lihl.gmall.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.UserService;

public class UserServiceImpl implements UserService {
	private static int count = 0;

	public List<UserAddress> getUserAddressList(String userId) {
		// retries重试次数
		System.out.println("UserServiceImpl----> " + count++);

		UserAddress userAddress1 = new UserAddress(1, "广东深圳", "001", "lihl", "13888888888", "Y");
		UserAddress userAddress2 = new UserAddress(1, "四川成都", "002", "jww", "13999999999", "Y");

		// timeout超时配置
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// retries重试次数
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return Arrays.asList(userAddress1, userAddress2);
	}

}
