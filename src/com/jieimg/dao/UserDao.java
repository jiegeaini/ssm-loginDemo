package com.jieimg.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @title �����û������ݿ�ӿ�
 * @author jiege
 */
public interface UserDao {
	/**
	 * @title ���ж��û��Ƿ����
	 * @fuanction ���������˵���û����ڣ�����û�д���
	 * @param username �û����û���
	 * @param password �û�������
	 * @return ���ز���ֵ
	 * @throws Exception
	 */
	String userBl(@Param("username")String username,@Param("password")String password)throws Exception;
}
