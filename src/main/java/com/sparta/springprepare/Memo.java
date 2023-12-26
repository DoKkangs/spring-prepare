package com.sparta.springprepare;


import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Memo {
    private String userName;
    private final String contents;
}