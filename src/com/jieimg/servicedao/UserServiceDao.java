package com.jieimg.servicedao;
/**
 * @title �����û���ҵ��dao��
 * @author jiege
 */
public interface UserServiceDao {
	/**
	 * @title �û���¼����
	 * @function �����û����û�����������в���
	 * @param username �û���
	 * @param password ����
	 * @return ���ز���ֵ
	 */
	public boolean login(String username,String password);
}
