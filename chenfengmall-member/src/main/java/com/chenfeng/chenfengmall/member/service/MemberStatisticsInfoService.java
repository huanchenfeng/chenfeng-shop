package com.chenfeng.chenfengmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.chenfengmall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:21:49
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

