package com.example.selfprj1back.controller;

import com.example.selfprj1back.domain.Board;
import com.example.selfprj1back.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {
    // board 서비스로 요청할 수 있도록 final 생성
    private final BoardService service;

    @PostMapping("add")
    // json 으로 넘어온 값을 받는 @RequestBody 어노테이션을 써서 Board DTO에 저장 시키고 board 라는 변수로 사용 한다.

    // ResponseEntity는 서버의 응답 코드를 반환 할 수 있다.
    public ResponseEntity add(@RequestBody Board board) {
        // service에서 save 요청 사용
        // service 에서 true 를 받으면 코드를 실행
        if(service.save(board)){
            // 잘 되었다면 ok 리턴
            return ResponseEntity.ok().build();
        }else{
            // 잘 못 되었다면 internalServer 에러를 반환 해주자
            return ResponseEntity.internalServerError().build();
        }
    }
}
