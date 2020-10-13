package com.example.restdocker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Value("${envname}")
    private String envname;

    @GetMapping("/hello")
    public String writeHello() {
        return "Hello!" + envname;
    }

}
