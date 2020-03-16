package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entitny) {
        this.id = entitny.getId();
        this.title = entitny.getTitle();
        this.content = entitny.getContent();
        this.author = entitny.getAuthor();
    }
}
