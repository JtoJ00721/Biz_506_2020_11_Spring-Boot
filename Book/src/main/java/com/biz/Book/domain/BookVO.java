package com.biz.Book.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="tbl_book")
public class BookVO {
    
    @Id // PK 설★정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 유일한 값으로 자동 생★성
    @Column(name = "id", columnDefinition = "BIGINT") // 테이블 칼럼 yee름을 자바 변수 이름이랑 같게 설★정
    private Long id;

    @Column(name = "str_name")
    private String strName;

    @Column(columnDefinition = "VARCHAR(125)") //columnDefinition을 지정하지 않으면 자동으로 VARCHAR(225)가 된다
    private String title;

    @Column(length = 30)
    private String author;

    @Column(length = 1000)
    private String comp;

    @Column(nullable = true)
    private int price;
    
}
