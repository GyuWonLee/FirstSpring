package com.gyuone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // 클라이언트의 요청을 받는 controller
public class HelloController {
	@GetMapping("/hello") // get방식으로 들어왔을 때 hello 메소드 실행
	public String hello(Model model, @RequestParam(value="name", required = false) String name) { // RequestParam 클라이언트에서 name이라는 항목으로 값을 전달한다. 
		model.addAttribute("greeting","안녕하세요, " + name); // greeting 키값. 클라이언트 모델형으로 전달.
		return "hello"; // string 으로 리턴 정체: view name 이름만 던져주는 것 hello.jsp를 만들 것이다.
		// 비즈니스 모델이 없는 구조
	}
}
