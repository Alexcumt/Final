package org.fkit.hrm.domain;

import java.io.Serializable;
public class Ordermanagement implements Serializable {			
	private Integer orderNumber;	
	private Integer userid;	
	private String order_time;
	private String order_count;
	private String order_status;
	public Ordermanagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Ordermanagement [orderNumber=" + orderNumber + ", userid=" + userid + ",  order_time=" + order_time+ ", order_count=" + order_count + ", order_status=" + order_status+"]";
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getOrder_time() {
		return order_time;
	}

	public void setOrder_time(String order_time) {
		this.order_time = order_time;
	}

	public String getOrder_count() {
		return order_count;
	}

	public void setOrder_count(String order_count) {
		this.order_count = order_count;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
}
