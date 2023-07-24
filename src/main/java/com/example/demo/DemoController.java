package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    
    @RequestMapping("/api/hello")
    public String getGreeting(){
        return "hello there :)";
    }

    @RequestMapping("/api/goodbye")
    public String getGoodbye(){
        return "see ya XD";
    }
}
