package com.pubhub100.dao;

import com.pubhub100.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user=new User();
		user.setName("raji");
		user.setEmail("raji@gmail.com");
		user.setPassword("mnop");
		UserDAO dao=new UserDAO();
		dao.register(user);
	}

}
