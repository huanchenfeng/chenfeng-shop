package com.chenfeng.chenfengmall.product.dao;

import com.chenfeng.chenfengmall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 09:58:12
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCatgory(@Param("catId") Long catId, @Param("name")String name);

}
