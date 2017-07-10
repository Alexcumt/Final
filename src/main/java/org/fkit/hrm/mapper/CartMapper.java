package org.fkit.hrm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.fkit.hrm.domain.Cart;
import org.fkit.hrm.domain.Commodity;

public interface CartMapper {
	@Insert("insert into cart(c_name,c_count) values(#{commodity_name},#{commodity_count}) ")
	Cart addCommodityWithInformation(@Param("commodity_name")String commodity_name,
			@Param("commodity_count") String commodity_count);
}
