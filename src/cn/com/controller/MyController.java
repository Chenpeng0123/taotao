package cn.com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController implements Controller {

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		modelAndView.setViewName("/b.jsp");
		return modelAndView;
	}

}
