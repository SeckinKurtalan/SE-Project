package com.sadproject.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/welcome")
public class Main {

@GetMapping()
public String mainTest(){
    return "Hello world";
}


}
