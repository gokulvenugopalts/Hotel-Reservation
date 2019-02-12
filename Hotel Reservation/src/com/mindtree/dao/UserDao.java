package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.User;

public interface UserDao {
	public List<User> authentication(String uname,String pass);
}
