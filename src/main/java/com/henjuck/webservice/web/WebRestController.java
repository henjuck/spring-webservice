package com.henjuck.webservice.web;

import com.henjuck.webservice.domain.posts.PostsRepository;
import com.henjuck.webservice.dto.posts.PostsSaveRequestDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

/**
 * WebRestController
 */

@RestController
@AllArgsConstructor // 모든 필드를 인자값으로 하는 생성자를 Lombok의 @AllArgsConstructor이 대신 생성해 준 다.
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

}