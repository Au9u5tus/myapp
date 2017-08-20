package com.yuhao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuhao.dao.UserDao;
import com.yuhao.model.pojo.UserPojo;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public void insert(UserPojo user) {
		userDao.insert(user);
	}

}
