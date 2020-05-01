package com.lihl.gmall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lihl.gmall.bean.UserAddress;
import com.lihl.gmall.service.OrderService;

@RestController
public class OrderController {
	@Autowired
	private OrderService orderServer;
	
	
	@GetMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("userId") String userId) {
		return orderServer.initOrder(userId);
	}

}
