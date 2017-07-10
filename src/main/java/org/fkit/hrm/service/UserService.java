package org.fkit.hrm.service;

import org.fkit.hrm.domain.User;

public interface UserService {


	User login(String usernname,String password);
	
	User modifyUser(String usernname,String password);

	User addUser(String username,String password,String sex,String phone,String Email);

	int findId(String username);
	
	String findEmail(String username);
}
