package com.example.selfprj1back.mapper;

import com.example.selfprj1back.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Insert("""
        INSERT INTO user( userId, nickName, password, email, phone)
        VALUE (#{userId}, #{nickName}, #{password}, #{email}, #{phone})
        """)
    int addUser(User user);

    @Select("""
        SELECT userId FROM user
        WHERE userId = #{userId}
        """)
    String checkByUserId(String userId);
}
