package com.biz.Book.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.biz.Book.domain.BookVO;

public interface BookService {

    public List<BookVO> selectAll();
    public BookVO findById(Long id);

    public int insert(BookVO bookVO);
    public int update(BookVO bookVO);
    public int delete(Long id);
	public Page<BookVO> pageSelect(Pageable pageable);



}
