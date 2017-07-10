package org.fkit.hrm.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;

import org.fkit.hrm.service.OrderService;
import org.fkit.hrm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class OrderController {
	@Autowired
	@Qualifier("orderService")
	private OrderService orderService;
	private UserService userService;
	@RequestMapping(value="/")
	public String addOrder(
			@RequestParam("username") String username,
			@RequestParam("commodity_name") String commodity_name,
			@RequestParam("order_count") Double order_count,
			 HttpSession session){
        int user_id = userService.findId(username);
		Date date=new Date();
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String order_time=format.format(date);
		String order_number=order_time+user_id;
		String order_status="待支付";
	//session.setAttribute("order_number", order_number);

		orderService.addOrder();
		orderService.addOrderManagement(order_number,user_id, order_time ,
				order_count,order_status);

		return "pay";
	}
	@RequestMapping(value="/successfulpay")
	public ModelAndView successpay(String order_number,
			ModelAndView mv){
		orderService.updateStatus(order_number);
		mv.setView(new RedirectView("./index"));
		 return mv;
	}
		}

