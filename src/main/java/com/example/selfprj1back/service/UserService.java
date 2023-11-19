package com.example.selfprj1back.service;

import com.example.selfprj1back.domain.User;
import com.example.selfprj1back.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.startup.Tomcat;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper mapper;

    public boolean add(User user) {
        return mapper.addUser(user) == 1;
    }


    public String checkByUserId(String userId) {
        return mapper.checkByUserId(userId);
    }

    public String checkByNickName(String nickName) {
        return mapper.checkByNickName(nickName);
    }

    public String checkByEmail(String email) {
        return mapper.checkByEmail(email);
    }

    public String checkByPhone(String phone) {
        return mapper.checkByPhone(phone);
    }
}
