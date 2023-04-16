package com.Dilly3.Security60.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/books")
public class BookResource {

    @GetMapping
    public ResponseEntity<String> getBook(){
        return ResponseEntity.ok().body("<h2>Welcome to All User Portal</h2>");
    }
}
