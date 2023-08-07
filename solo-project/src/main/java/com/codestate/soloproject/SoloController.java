package com.codestate.soloproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SoloController {
    @GetMapping("/")
    public String helloWorld() {
        return "To-Do Application!";
    }
}
