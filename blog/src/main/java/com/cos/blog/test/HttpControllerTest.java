package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

//사용자 요청에 대한 응답(data)
@RestController
public class HttpControllerTest {

    //http://localhost:8080/http/get
    @GetMapping("/http/get")
    public String getTest(){
        return "get 요청";
    }

    @PostMapping("/http/post")
    public String posetTest(){
        return "post 요청";
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("http/delete")
    public String deleteTest(){
        return "delete 요청";
    }



}
