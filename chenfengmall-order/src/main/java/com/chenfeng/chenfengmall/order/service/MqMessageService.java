package com.chenfeng.chenfengmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.chenfengmall.order.entity.MqMessageEntity;

import java.util.Map;

/**
 * 
 *
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:31:40
 */
public interface MqMessageService extends IService<MqMessageEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

