package com.henjuck.webservice.web;

import com.henjuck.webservice.service.PostsService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

/**
 * WebController
 */
@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}