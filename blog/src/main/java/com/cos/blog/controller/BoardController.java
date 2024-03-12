package com.cos.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping({"","/"})
    public String index(){


        //프리픽스 서픽스 설정으로 jsp찾아감
        return "index";
    }
}
