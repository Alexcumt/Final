package org.fkit.hrm.controller;


import org.fkit.hrm.domain.Cart;
import org.fkit.hrm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	@Autowired
	@Qualifier("cartService")
	private CartService cartService;
	//添加到购物车
	@RequestMapping(value="/addcart")
	public ModelAndView addCommodity(		
			 String commodity_name,
			 String commodity_count,
			 @ModelAttribute Cart cart,
			 ModelAndView mv){
			// 执行添加操作
			cartService.newcart(commodity_name,commodity_count);
			mv.setViewName("forward:/index");
			return mv;
		}
}
