package com.lihl.gmall.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.cluster.loadbalance.RoundRobinLoadBalance;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.OrderService;
import com.lihl.gmall.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class OrderServiceImpl implements OrderService {

//	@Reference(url = "127.0.0.1:20881")//绕过注册中心,dubbo直连方式
//	@Reference(loadbalance = RoundRobinLoadBalance.NAME)//负载均衡，默认随机
	@Reference(timeout = 1000) // 高可用，服务降级
	private UserService userService;

	@HystrixCommand(fallbackMethod = "hello")
	@Override
	public List<UserAddress> initOrder(String userId) {
		List<UserAddress> addressList = userService.getUserAddressList(userId);

		return addressList;
	}

	public List<UserAddress> hello(String userId) {

		return Arrays.asList(new UserAddress(0, "null", "000", "null", "null", "Y"));
	}

}
