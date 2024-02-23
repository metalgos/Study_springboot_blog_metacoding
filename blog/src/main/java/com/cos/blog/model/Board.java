package com.cos.blog.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private int id;

    @Column(nullable = false,length = 100)
    private String title;

    @Lob//대용량 데이터 사용할떄 쓰는것
    private String content; // 섬머노트 라이브러리 html 태그가 섞여서 디자인이 됨/

    @ColumnDefault("0") //숫자는 홑따옴표 필요없음
    private int count; //조회수

    @ManyToOne //many = board, one= user 한 유저는 여러 board를 사용가능
    @JoinColumn(name = "userid") //fk로 사용할 이름을 입력
    private User user; // db는 오브젝트를 저장할수 없다. FK를 그래서 사용. 하지만 자바는 오브젝트는 오브젝트를 저장할수 있다.

    @CreationTimestamp
    private Timestamp createDate;


}
