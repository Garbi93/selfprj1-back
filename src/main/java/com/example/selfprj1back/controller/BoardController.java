package com.example.selfprj1back.controller;

import com.example.selfprj1back.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    @PostMapping("add")
    // json 으로 넘어온 값을 받는 @RequestBody 어노테이션을 써서 Board DTO에 저장 시키고 board 라는 변수로 사용 한다 .
    public void add(@RequestBody Board board) {
        System.out.println("board = " + board);
    }
}
