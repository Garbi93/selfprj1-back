package com.example.selfprj1back.mapper;

import com.example.selfprj1back.domain.Board;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BoardMapper {

    @Insert("""
        INSERT INTO board(title, content)
        VALUE (#{title}, #{content})
        """)
    int insert(Board board);
}
