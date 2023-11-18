package com.example.selfprj1back.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {
    private Integer id;
    private String writer;
    private String title;
    private String content;
    private LocalDateTime inserted;
}
