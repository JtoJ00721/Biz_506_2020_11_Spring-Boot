package com.biz.Book.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookVO {
    private Long id;
    private String title;
    private String author;
    private String comp;
    private String price;
}
