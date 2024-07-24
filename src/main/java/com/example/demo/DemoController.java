package com.example.demo;

import org.springframework.http.ResponseEntity; 

import org.springframework.web.bind.annotation.GetMapping; 

import org.springframework.web.bind.annotation.RequestMapping; 

import org.springframework.web.bind.annotation.RestController; 

  
@RestController

@RequestMapping("/demo") 

public class DemoController { 

  

    @GetMapping("/1") 

    public ResponseEntity<String> getAnonymous() { 

        return ResponseEntity.ok("Welcome to  project"); 

    } 

  
}
