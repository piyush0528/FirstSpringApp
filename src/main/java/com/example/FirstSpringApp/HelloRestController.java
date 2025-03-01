package com.example.FirstSpringApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloRestController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello From BridgeLabz.";
    }
   
}