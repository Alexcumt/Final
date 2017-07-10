package org.fkit.hrm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.hrm.domain.User;

/**
 * UserMapper接口
 * */
public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user where  user_name=#{username}  and user_password = #{password}")
	User findWithLoginnameAndPassword(@Param("username")String username,
			@Param("password") String password);
	@Update("update user set password = #{password} where user_name= #{username} ")
	User modifyUserWithLoginname(@Param("username")String username,
			@Param("password") String password);
	@Insert("insert into user(user_name,user_password,user_sex,user_phone,user_email) values (#{username}, #{password},#{sex},#{phone},#{Email})")
	User addUserWithinformation(@Param("username")String username,
			@Param("password") String password,@Param("sex") String sex,
			@Param("phone") String phone,@Param("email") String email);
	@Select("select user_email from user where  user_name=#{username}")
	String findEmailWithUsername(@Param("username")String username);
	@Select("select user_id from user where  user_name=#{username}")
	int findUserIdWithNmae(@Param("username")String username);
}

