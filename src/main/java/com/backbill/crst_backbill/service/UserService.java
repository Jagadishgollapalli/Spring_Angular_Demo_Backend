package com.backbill.crst_backbill.service;
import java.util.List;

import com.backbill.crst_backbill.entity.User;

public interface UserService {

	public User saveUser(User user);

	public List<User> getAllUsers();

	public User Loginuser(String email, String password);
	

}
