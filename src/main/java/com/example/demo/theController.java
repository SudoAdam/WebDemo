package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class theController {

    @GetMapping
    @ResponseBody
    public String hello() { return "Hello World";}

    @GetMapping("/content")
    public String content() {
        return ("content");
    }

}


