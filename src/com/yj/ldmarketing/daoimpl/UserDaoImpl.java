package com.yj.ldmarketing.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.yj.ldmarketing.dao.UserDao;
import com.yj.ldmarketing.entity.User;

@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	/** 用户注册*/
	@Override
	public Integer insertUser(User user) {
		
		return (Integer)this.getHibernateTemplate().save(user);
	}

	/** 用户登陆*/
	@Override
	public String selectUser(User user) {
		List u = this.getHibernateTemplate().find("user", user);
		return null;
	}
	
}
