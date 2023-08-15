package com.chenfeng.chenfengmall.product.service.impl;

import com.chenfeng.chenfengmall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.common.utils.Query;

import com.chenfeng.chenfengmall.product.dao.BrandDao;
import com.chenfeng.chenfengmall.product.entity.BrandEntity;
import com.chenfeng.chenfengmall.product.service.BrandService;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;


@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {
    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String) params.get("key");
        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
        if(!ObjectUtils.isEmpty(key)){
        queryWrapper.eq("brand_id",key).or().like("name",key);}
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public void updateDetail(BrandEntity brand) {
        this.updateById(brand);
        if(!ObjectUtils.isEmpty(brand.getName())){
            categoryBrandRelationService.updateBrand(brand.getBrandId(),brand.getName());
        }
    }

}