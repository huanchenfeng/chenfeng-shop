package com.chenfeng.chenfengmall.coupon.dao;

import com.chenfeng.chenfengmall.coupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:15:09
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
