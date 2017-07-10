package org.fkit.hrm.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.hrm.domain.Commodity;

public interface CommodityMapper {
	@Update("update commodity set commodity_count=#{commodity_count},commodity_price=#{commodity_price},commodity_picture=#{commodity_picture},commodity_introduce=#{commodity_introduce}  where commodity_name = #{commodity_name} ")
	Commodity modifyCommodityWithInformation(@Param("commodity_name")String commodity_name,
			@Param("commodity_count") String commodity_count,@Param("commodity_price") Double commodity_price,
			@Param("commodity_picture") String commodity_picture,@Param("commodity_introduce") String commodity_introduce);
	@Insert("insert into commodity(commodity_name,commodity_count,commodity_price,commodity_picture, commodity_introduce) values(#{commodity_name},#{commodity_count},#{commodity_price},#{commodity_picture},#{commodity_introduce}) ")
	Commodity addCommodityWithInformation(@Param("commodity_name")String commodity_name,
			@Param("commodity_count") String commodity_count,@Param("commodity_price") Double commodity_price,
			@Param("commodity_picture") String commodity_picture,@Param("commodity_introduce") String commodity_introduce);
	@Delete("delete from commodity  where commodity_name = #{commodity_name} ")
	Commodity deleteCommodityWithName(String commodity_name);
	@Select("select commodity_id from commodity where  commodity_name=#{commodity_name}")
	String findUserIdWithUserName(@Param("username")String username);
}
