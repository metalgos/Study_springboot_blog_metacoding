package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment
    private int id;

   @Column(nullable = false , length = 200)
    private String content; // 섬머노트 라이브러리 html 태그가 섞여서 디자인이 됨

    @JoinColumn(name = "boardid")
    private Board board;

}
