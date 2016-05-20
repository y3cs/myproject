package com.yj.ldmarketing.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yj.ldmarketing.entity.User;
import com.yj.ldmarketing.service.UserService;

@Controller
@RequestMapping("/test")
public class UserController {
	@Autowired
	private UserService userService;
	
	String uuid = UUID.randomUUID().toString();

	@SuppressWarnings("unused")
	@RequestMapping("/test")
	public String saveUser(HttpServletRequest request, User user) {
		System.out.println("uuid:" + uuid);
		user.setUserid(uuid);
		if (user != null) {
			userService.addUser(user);
			return "/list";
		} else {
			return "/error";
		}
	}
}
