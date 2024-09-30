package com.backbill.crst_backbill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.backbill.crst_backbill.entity.User;
import com.backbill.crst_backbill.service.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

	@Autowired
	private UserService UserService;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return UserService.saveUser(user);
	}

	@GetMapping("/all-users")
	public List<User> getAllUsers(User user) {
		return UserService.getAllUsers();
	}

	@PostMapping("/login")
	public User LoginUser(@RequestBody User user) {

		String email = user.getEmail();
		String password = user.getPassword();
		User foundUser = UserService.Loginuser(email, password);

		if (foundUser != null) {
			return user;
		} else {
			throw new RuntimeException("Invalid Login Details");
		}
	}

}
