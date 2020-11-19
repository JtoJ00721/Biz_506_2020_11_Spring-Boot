package com.biz.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody; 

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping(value = "")
	public String hello() {
		return "에엑따..! Spring Boot다!!!";
	}
	
	@RequestMapping(value = "/home")
	public String home () {
		return "home";
	}
	
	@RequestMapping(value = "/hello")
	public String hello2(Model model) {
		model.addAttribute("username","농농이");
		model.addAttribute("tel","010-222-2222");
		return"hello";
	}
}
