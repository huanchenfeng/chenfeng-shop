package com.chenfeng.chenfengmall.common;

public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000,"系统位置异常"),
    VAILD_EXCEPTION(10001,"参数校验异常");
    private int code;
    private String msg;
    BizCodeEnume(int code,String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

