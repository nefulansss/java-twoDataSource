package com.nefu.test01.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class Gabalexception {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> exception(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("errorCode","101");
        map.put("errorMsg","系统错误!");
        return map;


    }

}
