package com.example.greetings.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingsController {
    @RequestMapping(value = "/greetings/{name}",method = RequestMethod.GET)
    public String greetings(@PathVariable String name){
        return ("Hello " + name + "!" );
    }

}
