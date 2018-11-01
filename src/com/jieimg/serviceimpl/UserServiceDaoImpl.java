package com.jieimg.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jieimg.dao.UserDao;
import com.jieimg.servicedao.UserServiceDao;

/**
 * @title 操作用户的业务dao层实现类
 * @author jiege
 */
@Service
public class UserServiceDaoImpl implements UserServiceDao {
	@Autowired
	UserDao userDao;
	@Override
	public boolean login(String username, String password) {
		try {
			if (userDao.userBl(username, password) != null) {
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
