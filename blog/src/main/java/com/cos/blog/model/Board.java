package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder //빌더패턴
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

    @ManyToOne (fetch = FetchType.EAGER)//many = board, one= user 한 유저는 여러 board를 사용가능
    //패치타입 : board테이블을 가져올떄 조인된 테이블을 무조건 가져올지 아닐지 결정. 기본은 lazy(필요시가져옴), eager는 무조건 가져옴
    @JoinColumn(name = "userid") //fk로 사용할 이름을 입력
    private User user; // db는 오브젝트를 저장할수 없다. FK를 그래서 사용. 하지만 자바는 오브젝트는 오브젝트를 저장할수 있다.

    @OneToMany(mappedBy = "board",fetch = FetchType.EAGER) // mapped : 연관관계(foreinkey)의 주인이 아니다. 외래키가 board가 아니라 reply 테이블에 만들어짐
    // 조인시 값을 가져오기 위해 columm 어노테이션 사용안함
    private List<Reply> reply;

    @CreationTimestamp
    private Timestamp createDate;


}
