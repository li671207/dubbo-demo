package com.lihl.gmall.service;

import java.util.List;

import com.lihl.gmall.bean.UserAddress;

public interface UserService {
	
	List<UserAddress> getUserAddressList(String userId);
}
