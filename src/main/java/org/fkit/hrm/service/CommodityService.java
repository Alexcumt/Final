package org.fkit.hrm.service;

public interface CommodityService {

    void modifyCommodity(String commodity_name, String commodity_count, Double commodity_price,
			String commodity_picture, String commodity_introduce);

	void addCommodity(String commodity_name, String commodity_count, Double commodity_price, String commodity_picture,
			String commodity_introduce);

	void deleteCommodity(String commodity_name);
	
	String findCommodity(String commodity_name);

}
