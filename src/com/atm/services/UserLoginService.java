package com.atm.services;

import com.atm.models.User;

public interface UserLoginService {
	
	public int loginUser(String username, String password);
	
	public User getById(int id);
	
	public boolean updateUser(User u);
	
}
