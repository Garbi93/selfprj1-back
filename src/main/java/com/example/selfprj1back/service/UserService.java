package com.example.selfprj1back.service;

import com.example.selfprj1back.domain.User;
import com.example.selfprj1back.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.startup.Tomcat;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // 회원 가입 할때에 공백인 상태가 들어가면 false를 리턴 해주기 위한 조건 설정
    public boolean validate(User user) {
        if(user == null) {
            return false;
        }

        if(user.getEmail().isBlank()){
            return false;
        }

        if(user.getPassword().isBlank()){
            return false;
        }

        if(user.getNickName().isBlank()) {
            return false;
        }

        if(user.getUserId().isBlank()) {
            return false;
        }

        if(user.getPhone().isBlank()) {
            return false;
        }

        return true;
    }

    public List<User> list() {
        return mapper.selectAll();
    }


    public User getUser(String id) {
        return mapper.selectById(id);
    }
}
