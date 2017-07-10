package org.fkit.hrm.service.impl;

import org.fkit.hrm.mapper.OrderMapper;
import org.fkit.hrm.service.OrderService;

public class OrderServiceImpl  implements OrderService{
	private OrderMapper orderMapper;
	@Override
	public void addOrder() {
		// TODO Auto-generated method stub
	}

	@Override
	public void updateStatus(String order_number) {
		// TODO Auto-generated method stub
		orderMapper.updateOrderWithOrderNumber(order_number);
	}

	@Override
	public void addOrderManagement(String order_number, int user_id, String order_time, Double order_count,
			String order_status) {
		// TODO Auto-generated method stub
		orderMapper.addManagementWithInformation(order_number, user_id,order_time,order_count,
				order_status);
	}

	
	
}
