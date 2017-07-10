package org.fkit.hrm.domain;

import java.io.Serializable;
public class Commodity implements Serializable {
	private Integer c_id;			
	private String c_name;	
	private String c_count;	
	private String c_price;
	private String c_picture;
	private String c_introduce;
	public Commodity() {
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
	public String getC_price() {
		return c_price;
	}
	public void setC_price(String c_price) {
		this.c_price = c_price;
	}
	public String getC_picture() {
		return c_picture;
	}
	public void setC_picture(String c_picture) {
		this.c_picture = c_picture;
	}
	public String getC_introduce() {
		return c_introduce;
	}
	public void setC_introduce(String c_introduce) {
		this.c_introduce = c_introduce;
	}
	@Override
	public String toString() {
		return "User [c_id=" + c_id + ", c_name=" +c_name + ",  c_count=" + c_count + ", c_price=" + c_price + ", c_picture" + c_picture + ", c_introduce" + c_introduce+"]";
	}
}
