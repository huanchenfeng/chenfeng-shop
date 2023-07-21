package com.chenfeng.chenfengmall.member.dao;

import com.chenfeng.chenfengmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:21:49
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
