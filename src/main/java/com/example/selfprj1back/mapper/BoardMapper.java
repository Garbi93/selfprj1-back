package com.example.selfprj1back.mapper;

import com.example.selfprj1back.domain.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Insert("""
        INSERT INTO board(title, content)
        VALUE (#{title}, #{content})
        """)
    int insert(Board board);

    @Select("""
        SELECT id, title, writer, inserted 
        FROM board
        ORDER BY id DESC 
        """)
    List<Board> selectAll();

    @Select("""
        SELECT * FROM board
        WHERE id = #{id}
        """)
    Board selectById(Integer id);

    @Delete(""" 
        DELETE FROM board
        WHERE id = #{id}
        """)
    int deleteById(Integer id);

    @Update("""
        UPDATE board
        SET title = #{title} , content = #{content}
        WHERE id = #{id}
        """)
    int updateById(Board board);
}
