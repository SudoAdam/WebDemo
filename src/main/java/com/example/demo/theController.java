package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class theController {

    @GetMapping
    @ResponseBody
    public String hello() { return "Hello World";}

    @GetMapping("/pagedemo4")
    public String style() {
        return ("pagedemo4");
    }

    @GetMapping("/pagedemo")
    public String styleOne() {
        return ("pagedemo");
    }

    @GetMapping("/pagedemo2")
    public String styleTwo() { return ("pagedemo2"); }

    @GetMapping("/pagedemo3")
    public String styleThree() { return ("pagedemo3"); }

}


