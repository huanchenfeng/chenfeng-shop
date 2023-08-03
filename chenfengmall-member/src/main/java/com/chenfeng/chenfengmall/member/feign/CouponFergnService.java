package com.chenfeng.chenfengmall.member.feign;

import com.chenfeng.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient("chenfengmall-coupon")
public interface CouponFergnService {
    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();
}
