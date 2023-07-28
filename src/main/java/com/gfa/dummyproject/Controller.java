package com.gfa.dummyproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Controller {

    @GetMapping("/")
    public String home() {
        return "This is the best thing on the internet for today, sorry:(";
    }
}
