package org.fkit.hrm.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface OrderMapper {
	@Update("update ordermanagement set order_Status=‘待发货’  where order_number = #{order_number} ")
	void updateOrderWithOrderNumber(@Param("order_Status")String order_Status);
    @Insert("insert into ordermanagement(order_nember,user_id,order_time,order_count,order_status)values(#{order_nember},#{user_id},#{order_time},#{order_count},#{order_status})")
	void addManagementWithInformation(String order_nember, int user_id, String order_time, Double order_count,
			String order_status);
}
