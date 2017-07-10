package org.fkit.hrm.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;

import org.fkit.hrm.cookie.CookieTool;
import org.fkit.hrm.domain.User;
import org.fkit.hrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mysql.fabric.Response;

/**
 * 处理用户请求控制器
 * */
@Controller
public class UserController {
	
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	private UserService userService;
		
	/**
	 * 处理登录请求
	 * @param String loginname  登录名
	 * @param String password 密码
	 * @return 跳转的视图
	 * */
	@RequestMapping(value="/login")
	 public ModelAndView login(@RequestParam("username") String username,
			 @RequestParam("password") String password,
			 @RequestParam("remember") String remember,
			 HttpSession session,
			 ModelAndView mv){

	   //Cookie
		// 调用业务逻辑组件判断用户是否可以登录
		Cookie[] cookies = request.getCookies();//获取一个cookie数组
	    for (int i = 0; i < cookies.length; i++) {//对cookies中的数据进行遍历，找到用户名、密码的数据
	      if ("username".equals(cookies[i].getName())) {
	           String user_name = cookies[i].getValue();
	           if ("password".equals(cookies[i].getName())) {
	                  String pass_word = cookies[i].getValue();
	           }
        }else{
   
			 if(remember.equals("1")){
				 CookieTool cookie=new CookieTool(username,password);
				 cookie.addCookie();
			 }
			}
        }
		User user = userService.login(username, password);
		if(user != null){
			// 将用户保存到HttpSession当中
			session.setAttribute("user", user);
			// 客户端跳转到main页面
			mv.setView(new RedirectView("./index"));
		}else{
			// 设置登录失败提示信息
			mv.addObject("message", "用户名或密码错误!请重新输入");
			// 服务器内部跳转到登录页面
			mv.setViewName("forward:/index");
		}
		return mv;
		
	}
	/**
	 * 处理修改用户请求
	 * @param String flag 标记， 1表示跳转到修改页面，2表示执行修改操作
	 * @param User user  要修改用户的对象
	 * @param ModelAndView mv
	 * */
	@RequestMapping(value="/user/updateUser")
	 public ModelAndView updateUser(
			 String usernname,
			 String password,
			 @ModelAttribute User user,
			 ModelAndView mv){
			// 执行修改操作
			userService.modifyUser(usernname,password);
            //修改成功
			mv.addObject("message", "修改成功，请重新登录");
			mv.setView(new RedirectView("./index"));
			return mv;
	}
	
	
	/**
	 * 处理添加请求
	 * @param String flag 标记， 1表示跳转到添加页面，2表示执行添加操作
	 * @param User user  要添加用户的对象
	 * @param ModelAndView mv
	 * */
	@RequestMapping(value="/newLogin")
	 public ModelAndView addUser(		
			 String username,
			 String password,	
			 String sex,
			 String phone,
		     String Email,
		     String confirmPassword,
			 @ModelAttribute User user,
			 ModelAndView mv){
			// 执行添加操作
		if(password.equals(confirmPassword)){
			userService.addUser(username,password,sex,phone, Email);
			mv.addObject("message", "Successful Operation!");
			mv.setViewName("forward:/index");
		}else{
			mv.addObject("message", "Failed Operation!Please make sure the two password are the same.");
			mv.setViewName("forward:/index");
		}
			return mv;
		}
	//找回密码
	@RequestMapping(value="/findback")
	 public ModelAndView findBack(		
			 String username,
			 String email,
			 String password,
			 @ModelAttribute User user,
			 HttpSession session,
		 ModelAndView mv){
		String mEmail = userService.findEmail(username);
		if( email.equals(mEmail)){
			// 执行修改操作
			userService.modifyUser(username,password);
		}else{
			// 设置登录失败提示信息
			mv.addObject("message", "Email信息错误!请重新输入");
			// 服务器内部跳转到登录页面
			mv.setViewName("forward:/index");
		}
		return mv;
	}}
	
	
