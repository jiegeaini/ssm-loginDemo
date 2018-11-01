package com.jieimg.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @title 操作用户的数据库接口
 * @author jiege
 */
public interface UserDao {
	/**
	 * @title 来判断用户是否存在
	 * @fuanction 如果返回真说明用户存在，假则没有存在
	 * @param username 用户的用户名
	 * @param password 用户的密码
	 * @return 返回布尔值
	 * @throws Exception
	 */
	String userBl(@Param("username")String username,@Param("password")String password)throws Exception;
}
