package org.fkit.hrm.service;


public interface OrderService {
    void addOrder();
	
	


	void addOrderManagement(String order_number, int user_id, String order_time, Double order_count,
			String order_status);




	void updateStatus(String order_number);
}
