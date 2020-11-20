package com.biz.Book.service;

import com.biz.Book.domain.BookVO;
import com.biz.Book.persistence.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("bookServiceV1")
public class BookServiceImplV1 implements BookService{

    private BookRepository bookRepository;

    public BookServiceImplV1(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<BookVO> selectAll() {
        List<BookVO> bookList = bookRepository.findAll();
        return bookList;
    }

    /**
     *
     * Optional
     *   데이터가 없음을 null이 아닌 어떤 명확한 근거를 바탕으로 알고싶다
     *   라는 취지에서 새로 생성한 wrapper 클래스
     *   VO 클래스를 감싸는 wrapper 클래스
     *
     *   일반적으로 DB핸들링에서 findById(Long id)를 수행한 후
     *   di에 해당하는 데이터가 없을경우 return 값이 null이었다
     *   if(vo == null) {
     *       log.debug("데이터가 없음")
     *       }
     *
     * Optional은 어떤 객체의 저장된 값이 null인가를 비교하는 것을
     * 사용하지 않기 위해서 새롭게 등장한 class 이다.
     * 
     * null 값을 비교하는 것보다 연산 비용이 많이 든다
     * 아직은 바람직한 코드인지 키베를 많이 뜬다.
     */
    @Override
    public BookVO findById(Long id) {
        Optional<BookVO> vo = bookRepository.findById(id);
        
        // 만약 findById() 를 수행하여 데이터가 없으면
        // 새로운 VO를 만드록 id값을 -1로 세팅하여 리턴하라
        // return vo.orElse(BookVO.builder().id(-1L).build());
        return vo.get();
    }

    @Override
    public int insert(BookVO bookVO) {
        bookRepository.save(bookVO);
        return 0;
    }

    @Override
    public int update(BookVO bookVO) {
        bookRepository.save(bookVO);
        return 0;
    }

    @Override
    public int delete(Long id) {
        bookRepository.deleteById(id);
        return 0;
    }
}
