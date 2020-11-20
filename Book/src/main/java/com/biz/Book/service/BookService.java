package com.biz.Book.service;

import com.biz.Book.domain.BookVO;

import java.util.List;

public interface BookService {

    public List<BookVO> selectAll();
    public BookVO findById(Long id);

    public int insert(BookVO bookVO);
    public int update(BookVO bookVO);
    public int delete(Long id);



}
