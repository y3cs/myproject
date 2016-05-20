package com.yj.ldmarketing.dao;


import com.yj.ldmarketing.entity.User;

public interface UserDao {
	/** 用户注册*/
	public Integer insertUser(User user);
	
	/** 用户登陆*/
	public String selectUser(User user);
}
