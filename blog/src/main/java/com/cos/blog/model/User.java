package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

//ORM - > 자바 오브젝트를 테이블로 매핑해준다.

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //빌더패턴
@Entity //User 클래스가 mysql 테이블이 생성이 된다
//@DynamicInsert // null값을 제외하고 테이블에 인서트됨
public class User {

    @Id  //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다(오라클이면 시퀀스, mysql은 오토 인크리먼트
    private int id;//오라클 시퀀스, 마리아 오토 인크리먼트

    @Column(nullable = false, length = 30, unique = true) //중복 방지하기 위해서 unique 옵션 사용
    private String username ; //아이디
    @Column(nullable = false, length = 100) // 12345 -> 해쉬(암호화)
    private String password;
    @Column(nullable = false, length = 50)
    private String email;


    //@ColumnDefault("'user'") //문자라는것을 알리기 위해쌍따옴표 안에 작은따옴표 를 넣어야함
    //DB는 roletype이 없다. 그러므로
    @Enumerated(EnumType.STRING) //enum 이 db에는 string으로 입력되도록 설정
    private RoleType role; //원래는 오타 방지를 위해 enum을 쓰는게 좋다. //ADMIN,USER

    @CreationTimestamp //시간이 자동 입력
    private Timestamp createDate;


}
