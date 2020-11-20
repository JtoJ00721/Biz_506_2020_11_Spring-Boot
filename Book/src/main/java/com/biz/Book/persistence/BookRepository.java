package com.biz.Book.persistence;

import com.biz.Book.domain.BookVO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookVO,Long> {



}
