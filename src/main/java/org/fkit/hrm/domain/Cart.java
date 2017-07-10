package org.fkit.hrm.domain;

import java.io.Serializable;
public class Cart implements Serializable {

	private Integer c_id;			
	private String c_name;	
	private String c_count;
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_count() {
		return c_count;
	}

	public void setC_count(String c_count) {
		this.c_count = c_count;
	}
	@Override
	public String toString() {
		return "Cart [c_id=" + c_id + ", c_name=" + c_name + ", c_count=" + c_count + "]";
	}
}
