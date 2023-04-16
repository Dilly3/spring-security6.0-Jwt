package com.Dilly3.Security60.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/books")
public class AdminResource {

    @GetMapping
    public ResponseEntity<String> getAdmin(){
        return ResponseEntity.ok().body("<h2>Welcome to Admin portal</h2>");
    }

}
