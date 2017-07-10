package org.fkit.hrm.service.impl;

import org.fkit.hrm.domain.User;
import org.fkit.hrm.service.UserService;
import org.fkit.hrm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService{

	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public User login(String username, String password) {
		return userMapper.findWithLoginnameAndPassword(username, password);
	}
    /*修改密码*/
	@Override
	public User modifyUser(String usernname, String password) {
		// TODO Auto-generated method stub
		return userMapper.modifyUserWithLoginname(usernname, password);
	}
	/*注册新用户*/
	@Override
	public User addUser(String username,String password,String sex,String phone,String Email) {
		// TODO Auto-generated method stub
		return userMapper.addUserWithinformation(username,password,sex,phone, Email);
	}
	@Override
	public String findEmail(String username) {
		// TODO Auto-generated method stub
		return userMapper.findEmailWithUsername(username);
	}
	@Override
	public int findId(String username) {
		// TODO Auto-generated method stub
		return userMapper.findUserIdWithNmae(username);
	}

}