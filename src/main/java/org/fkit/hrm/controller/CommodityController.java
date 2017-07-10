package org.fkit.hrm.controller;

import org.fkit.hrm.domain.Commodity;
import org.fkit.hrm.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class CommodityController {
	@Autowired
	@Qualifier("commodityService")
	private CommodityService commodityService;
	//添加商品
	@RequestMapping(value="/")
	 public ModelAndView addCommodity(		
			 String commodity_name,
			 String commodity_count,
			 Double commodity_price,
			 String commodity_picture,
			 String commodity_introduce,
			 @ModelAttribute Commodity commodity,
			 ModelAndView mv){
			// 执行添加操作
			commodityService.addCommodity(commodity_name,commodity_count,commodity_price,
					commodity_picture, commodity_introduce);
			mv.addObject("message", "添加商品成功!");
			mv.setViewName("forward:/index");
			return mv;
		}
	//删除商品
	@RequestMapping(value="/")
	 public ModelAndView deleteCommodity(		
			 String commodity_name,
			 @ModelAttribute Commodity commodity,
			 ModelAndView mv){
			// 执行添加操作
			commodityService.deleteCommodity(commodity_name);
			mv.addObject("message", "删除商品成功!");
			mv.setViewName("forward:/index");
			return mv;
		}
	//修改商品信息
	@RequestMapping(value="/updateC")
	 public ModelAndView updateCommodity(
			 String commodity_name,
			 String commodity_count,
			 Double commodity_price,
			 String commodity_picture,
			 String commodity_introduce,
			 @ModelAttribute Commodity commodity,
			 ModelAndView mv){
			// 执行修改操作
			commodityService.modifyCommodity(commodity_name,commodity_count,commodity_price,
					commodity_picture, commodity_introduce);
           //修改成功
			mv.addObject("message", "修改成功!");
			mv.setView(new RedirectView("./index"));
			return mv;
	}
	//库存统计
	//销售统计
}
