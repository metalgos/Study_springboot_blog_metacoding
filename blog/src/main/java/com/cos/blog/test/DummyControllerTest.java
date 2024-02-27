package com.cos.blog.test;

import com.cos.blog.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {


    //http://localhost:8000/blog/dummy/join (요청)
    // http body에 데이터를 가지고 (요청)
    @PostMapping("/dummy/join")

    //public String join(String username, String password, String email){

        //System.out.println("username : "+username);
       // System.out.println("password : " +password);
       // System.out.println("email : "+email);

    public String join(User user){
        System.out.println("id" + user.getId());
        System.out.println("username : "+user.getUsername());
        System.out.println("password : " + user.getPassword());
        System.out.println("email : "+user.getEmail());
        return "회원가입이 완료되었습니다.";

    }
}
