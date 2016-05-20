package com.yj.ldmarketing.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yj.ldmarketing.dao.UserDao;
import com.yj.ldmarketing.entity.User;
import com.yj.ldmarketing.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public Integer addUser(User user) {
		return this.userDao.insertUser(user);
	}

}
