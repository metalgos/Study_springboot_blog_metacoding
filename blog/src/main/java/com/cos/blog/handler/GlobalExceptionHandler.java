package com.cos.blog.handler;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


//에러 exception 처리하기
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)//( 에러에 따라 리턴값 다르게 설정가능)
    public String handleArgumentException(Exception e){

        return "<h1>" +e.getMessage()+"</h1>";
    }


}
