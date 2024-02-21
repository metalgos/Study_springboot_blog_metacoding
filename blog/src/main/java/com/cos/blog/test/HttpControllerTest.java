package com.cos.blog.test;

import org.springframework.web.bind.annotation.*;

//사용자 요청에 대한 응답(data)
@RestController
public class HttpControllerTest {

    //http://localhost:8080/http/get
    @GetMapping("/http/get") //기본 브라우저 요청은 겟방식
    public String getTest(Member m  ){
        return "get 요청 " + m.getId() +" " +  m.getUsername()+" " +m.getPassword() +" " +m.getEmail();
    }


    @PostMapping("/http/post") // 텍스트 플레인, 제이슨 테스트
    public String posetTest(@RequestBody Member m){ //메시지 컨버터가 제이슨으로 변경
        return "post 요청 "+ m.getId() +" " +  m.getUsername()+" " +m.getPassword() +" " +m.getEmail();
    }

    @PutMapping("/http/put")
    public String putTest(@RequestBody Member m){
        return "put 요청"+ m.getId() +" " +  m.getUsername()+" " +m.getPassword() +" " +m.getEmail();
    }

    @DeleteMapping("http/delete")
    public String deleteTest(){
        return "delete 요청";
    }



}
