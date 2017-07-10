package org.fkit.hrm.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
		
	private String username;	
	private String password;	
	private String sex;
	private String phone;
	private String email;
	private int user_id;
	// 无参数构造器
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	// setter和getter方法
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ",  password=" + password + ", sex=" + sex + ", phone" + phone + ", email" + email+"]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	
	
}
