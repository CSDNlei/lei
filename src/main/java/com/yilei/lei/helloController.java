package com.yilei.lei;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/page")
    public String hello(){
        return "hello caonima";
    }
}
