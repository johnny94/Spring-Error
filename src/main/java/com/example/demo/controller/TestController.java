package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/post")
    @ResponseBody
    public String testPost() {
        return "AAA";
    }
}
