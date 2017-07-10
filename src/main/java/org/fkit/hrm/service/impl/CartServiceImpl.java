package org.fkit.hrm.service.impl;

import org.fkit.hrm.mapper.CartMapper;
import org.fkit.hrm.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;

public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cartMapper;
	@Override
	public void newcart(String commodity_name, String commodity_count) {
		// TODO Auto-generated method stub
		cartMapper.addCommodityWithInformation(commodity_name, commodity_count);
	}

}
