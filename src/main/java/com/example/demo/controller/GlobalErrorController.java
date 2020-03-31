package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GlobalErrorController implements ErrorController {

    @RequestMapping("/error")
    @ResponseBody
    public String error(HttpServletRequest req) {
        return "You got error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
