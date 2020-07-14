package com.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EventDemoApp {
    public static void main(String[] args) {
        SpringApplication.run(EventDemoApp.class, args);
    }



    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public String register(){
        userService.register("kirito");
        return "success";
    }

}