package com.after.project.Conttoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.after.project.DTO.TestDTO;
import com.after.project.service.TestService;

@Controller
public class TestController {
	@Autowired TestService ts;
	@RequestMapping("index")
	public void index() {
	
	}
	@PostMapping("login")
	public String login(TestDTO test) {
		ts.test(test);
		return "redirect:index";
	}
}
