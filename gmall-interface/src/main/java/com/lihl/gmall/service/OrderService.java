package com.lihl.gmall.service;

import java.util.List;

import com.lihl.gmall.bean.UserAddress;

public interface OrderService {

	List<UserAddress> initOrder(String userId);
}
