package com.murali.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/v1")
    public String getResponse() {
        return "Hellooooo";
    }
}
