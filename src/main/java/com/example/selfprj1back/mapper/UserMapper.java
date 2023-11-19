package com.example.selfprj1back.mapper;

import com.example.selfprj1back.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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
    @Select("""
        SELECT nickName FROM user
        WHERE nickName = #{nickName}
        """)
    String checkByNickName(String nickName);

    @Select("""
        SELECT email FROM user
        WHERE email = #{email}
        """)
    String checkByEmail(String email);

    @Select("""
        SELECT phone FROM user
        WHERE phone = #{phone}
        """)
    String checkByPhone(String phone);

    @Select("""
        SELECT * FROM user
        ORDER BY inserted DESC 
        """)
    List<User> selectAll();

}
