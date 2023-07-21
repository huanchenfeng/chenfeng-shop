package com.chenfeng.chenfengmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.chenfengmall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 09:58:12
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

