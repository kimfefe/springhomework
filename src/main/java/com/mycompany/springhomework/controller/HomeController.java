package com.mycompany.springhomework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		log.info("실행1");
		log.info("실행2");
		log.info("실행3");
		
		log.info("과제 테스트1");
		log.info("과제 테스트2");
		log.info("과제 테스트3");
		return "index";
	}
}
