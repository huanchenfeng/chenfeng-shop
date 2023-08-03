package com.chenfeng.chenfengmall.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.chenfeng.chenfengmall.member.feign.CouponFergnService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chenfeng.chenfengmall.member.entity.MemberEntity;
import com.chenfeng.chenfengmall.member.service.MemberService;
import com.chenfeng.common.utils.PageUtils;
import com.chenfeng.common.utils.R;



/**
 * 会员
 *
 * @author chenfeng
 * @email 2733828240@qq.com
 * @date 2023-07-10 16:21:49
 */
@RestController
@RequestMapping("menber/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    CouponFergnService couponFergnService;

    @RequestMapping("/coupons")
    public R test(){
        MemberEntity memberEntity=new MemberEntity();
        memberEntity.setNickname("张三");
        R membercoupons = couponFergnService.membercoupons();
        return R.ok().put("member",memberEntity).put("coupons",membercoupons.get("coupons"));

    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
