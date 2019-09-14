package com.example.demoautomation;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {

    @GetMapping("/")
    public ResponseEntity<?> demon() {
        return ResponseEntity.ok("Deploy automático!");
    }
}
