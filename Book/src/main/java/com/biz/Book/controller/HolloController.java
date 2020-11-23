package com.biz.Book.controller;

import com.biz.Book.domain.BookVO;
import com.biz.Book.service.BookService;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HolloController {

	@Qualifier("bookServiceV1")
	private final BookService bService;

	public HolloController(BookService bService) {
		this.bService = bService;
	}

	// @ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String hello() {
		return "home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("username", "농농이");
		model.addAttribute("tel", "010-222-2222");
		return "home";
	}

	@RequestMapping(value = "/car", method = RequestMethod.GET)
	public String car(Model model) {

		BookVO bookVO = BookVO.builder().title("조선 민족 전래동화 농농이").author("쩔쩔이").comp("스팀???").build();

		return "book/list_ex";
	}

}
