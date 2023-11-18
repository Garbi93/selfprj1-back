package com.example.selfprj1back.service;

import com.example.selfprj1back.domain.Board;
import com.example.selfprj1back.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
