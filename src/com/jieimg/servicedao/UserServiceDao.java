package com.jieimg.servicedao;
/**
 * @title 操作用户的业务dao层
 * @author jiege
 */
public interface UserServiceDao {
	/**
	 * @title 用户登录方法
	 * @function 根据用户的用户名和密码进行操作
	 * @param username 用户名
	 * @param password 密码
	 * @return 返回布尔值
	 */
	public boolean login(String username,String password);
}
