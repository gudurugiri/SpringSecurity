package com.test.users.dao;

import com.test.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}