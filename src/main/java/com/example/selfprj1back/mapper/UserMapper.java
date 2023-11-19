package com.example.selfprj1back.mapper;

import com.example.selfprj1back.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("""
        INSERT INTO user( userId, nickName, password, email, phone)
        VALUE (#{userId}, #{nickName}, #{password}, #{email}, #{phone})
        """)
    int addUser(User user);
}
