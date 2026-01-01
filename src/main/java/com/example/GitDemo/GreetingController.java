package com.example.GitDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return new ResponseEntity<String>("hi from DEV_B", HttpStatus.OK);
    }
}
