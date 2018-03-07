package cn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController2 {
	@RequestMapping("/query")
	public ModelAndView query() {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		modelAndView.setViewName("/b.jsp");
		return modelAndView;
	}
}
