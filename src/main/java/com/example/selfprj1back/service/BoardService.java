package com.example.selfprj1back.service;

import com.example.selfprj1back.domain.Board;
import com.example.selfprj1back.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardMapper mapper;

    public void save(Board board) {
        mapper.insert(board);
    }
}
