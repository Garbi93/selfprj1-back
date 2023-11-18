package com.example.selfprj1back.service;

import com.example.selfprj1back.domain.Board;
import com.example.selfprj1back.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public boolean save(Board board) {
        // mapper가 return한 int 즉 값이 저장이 1개만 되면 1을 반환 하기 때문에 1을 받으면
        // boolean 타입으로 true 를 controller에 전달하고,
        // mapper 에서 1을 못 받으면 false 를 controller에 반환 한다.
        return mapper.insert(board) == 1;
    }

    // Controller 에서 보내준 board 데이터 를 검증 하는 service
    public boolean validate(Board board) {
        // board에 받아온 값이 null 이면 false return
        if(board == null){
            return false;
        }

        // 받은 board가 content 가 null 이거나 비어있는 값 이면 false return
        if(board.getContent() == null || board.getContent().isBlank()){
            return false;
        }
        // 받은 board가 title (제목)이 null 이거나 비어있는 값이면 false return
        if(board.getTitle() == null || board.getTitle().isBlank()){
            return false;
        }
        return true;
    }

    public List<Board> list() {
        return mapper.selectAll();
    }

    public Board get(Integer id) {
        return mapper.selectById(id);
    }

    public boolean remove(Integer id) {
        return mapper.deleteById(id) == 1;
    }
}
