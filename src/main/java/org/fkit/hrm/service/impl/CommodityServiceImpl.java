package org.fkit.hrm.service.impl;

import org.fkit.hrm.mapper.CommodityMapper;
import org.fkit.hrm.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("commodityService")
public class CommodityServiceImpl implements CommodityService{
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Transactional(readOnly=true)
	  /*修改商品信息*/
	@Override
	public void modifyCommodity(String commodity_name, String commodity_count, Double commodity_price,
			String commodity_picture, String commodity_introduce) {
		 commodityMapper.modifyCommodityWithInformation(commodity_name,commodity_count,commodity_price,commodity_picture, commodity_introduce);
	}

	@Override
	public void addCommodity(String commodity_name, String commodity_count, Double commodity_price,
			String commodity_picture, String commodity_introduce) {
		// TODO Auto-generated method stub
		 commodityMapper.addCommodityWithInformation(commodity_name,commodity_count,commodity_price,commodity_picture, commodity_introduce);
	}

	@Override
	public void deleteCommodity(String commodity_name) {
		// TODO Auto-generated method stub
		 commodityMapper.deleteCommodityWithName(commodity_name);
	}

	@Override
	public String findCommodity(String commodity_name) {
		// TODO Auto-generated method stub
		return commodityMapper.findUserIdWithUserName(commodity_name);
	}
}
