package com.cos.blog.test;

import lombok.*;

@Data

@NoArgsConstructor
public class Member {


    private int id;
    private  String username;
    private  String password;
    private  String email;

    @Builder //빌더 패턴을 위한 어노테이션 파라미터 순서에 상관없이 사용하기
    public Member(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
