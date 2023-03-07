package com.example.bootdocker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @GetMapping("/{name}")
    public ResponseEntity welcome(@PathVariable(value = "name") String name) {
        {
            return ResponseEntity.ok("Welcome " + name + " !!! to Docker BootApplication");
        }
    }
}
