package org.fkit.hrm.domain;

import java.io.Serializable;
public class Order implements Serializable {
	
	private Integer orderid;			
	private Integer orderNumber;	
	private String cId;	
	private String cCount;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcCount() {
		return cCount;
	}

	public void setcCount(String cCount) {
		this.cCount = cCount;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", orderNumber=" + orderNumber + ",  cId=" + cId + ", cCount=" + cCount + "]";
	}
}
