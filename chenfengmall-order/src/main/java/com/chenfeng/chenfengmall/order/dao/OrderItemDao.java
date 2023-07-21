package com.chenfeng.chenfengmall.order.dao;

import com.chenfeng.chenfengmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:31:40
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
