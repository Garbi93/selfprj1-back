package com.example.selfprj1back.controller;

import com.example.selfprj1back.domain.User;
import com.example.selfprj1back.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final UserService service;

    @PostMapping("add")
    public void add(@RequestBody User user) {
        service.add(user);
    }

    @GetMapping(value = "check", params = "userId")
    public ResponseEntity checkUserId(String userId) {
       if( service.checkByUserId(userId) == null){
            return ResponseEntity.notFound().build();
       }else {
           return ResponseEntity.ok().build();
       }
    }

    @GetMapping(value = "check", params = "nickName")
    public ResponseEntity checkNickName(String nickName) {
        if( service.checkByNickName(nickName) == null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping(value = "check", params = "email")
    public ResponseEntity checkEmail(String email) {
        if( service.checkByEmail(email) == null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok().build();
        }
    }
    @GetMapping(value = "check", params = "phone")
    public ResponseEntity checkPhone(String phone) {
        if( service.checkByPhone(phone) == null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok().build();
        }
    }


}
