package com.chenfeng.chenfengmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.chenfengmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 09:58:13
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

    void removeMenuByIds(List<Long> asList);
}

