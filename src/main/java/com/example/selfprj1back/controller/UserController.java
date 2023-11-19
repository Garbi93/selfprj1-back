package com.example.selfprj1back.controller;

import com.example.selfprj1back.domain.User;
import com.example.selfprj1back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    @PostMapping("add")
    public void add(@RequestBody User user) {
        service.add(user);
    }

}
