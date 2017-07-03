package com.pubhub100.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.pubhub100.model.User;
import com.pubhub100.util.ConnectionUtil;

public class UserDAO {

	public void register(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("INSERT INTO USERS (name,email,password) values (?,?,?)");
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.executeUpdate();
	}

	public boolean login(User user) throws Exception {
		Connection connection = ConnectionUtil.getConnection();
		PreparedStatement pst = connection.prepareStatement("SELECT NAME FROM USERS WHERE EMAIL=? AND PASSWORD=?");
		pst.setString(1, user.getEmail());
		pst.setString(2, user.getPassword());
		ResultSet rs = pst.executeQuery();
		boolean flag = false;
		if (rs.next()) {
			flag = true;
		}
		return flag;
	}

}
