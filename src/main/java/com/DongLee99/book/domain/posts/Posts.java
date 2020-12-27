package com.DongLee99.book.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //모든 필드의 getter 메소드를 자동 생
@NoArgsConstructor //기본 생성자 자동 추
@Entity //테이블과 링크될 클래        //롬복의 어노테이션들 =초반에 빈번하게 변경되는 코드를 최소화 시켜주기 위함
public class Posts {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id; //ID

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition =  "TEXT" , nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        System.out.print(this.title + this.content + this.author);
    }
    public void update(String title, String content) {
        this.title = title;
        this.content =content;
    }


}
