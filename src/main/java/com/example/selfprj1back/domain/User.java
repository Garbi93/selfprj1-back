package com.example.selfprj1back.domain;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String userId;
    private String nickName;
    private String password;
    private String email;
    private String phone;
}
