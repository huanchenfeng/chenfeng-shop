package com.chenfeng.chenfengmall.product.exception;

import com.chenfeng.chenfengmall.common.BizCodeEnume;
import com.chenfeng.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/*
*集中处理异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com/chenfeng/chenfengmall/product/controller")
public class chenfengmallExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
public R handleVaildException(MethodArgumentNotValidException e){
        BindingResult bindingResult=e.getBindingResult();
        Map<String ,String> errorMap=new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError -> {
            errorMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        }));
    log.error("数据校验出现问题{}",e.getMessage(),e.getClass());
    return  R.error(BizCodeEnume.VAILD_EXCEPTION.getCode(), BizCodeEnume.VAILD_EXCEPTION.getMsg()).put("data",errorMap);
}
@ExceptionHandler(value = Throwable.class)
    public R handleException(Throwable throwable){
        return R.error(BizCodeEnume.UNKNOW_EXCEPTION.getCode(), BizCodeEnume.UNKNOW_EXCEPTION.getMsg());
}
}

