package com.ServiceLayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DaoLayer.UserDao;
import com.Model.User;

@Service
public class userService {
	@Autowired
	private UserDao userdao;

	public int CreateUser(User user) {
		return this.userdao.saveuser(user);
	}

}
