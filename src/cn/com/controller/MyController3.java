package cn.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.domain.User;

@Controller
public class MyController3 {
    @RequestMapping("/add")
    @ResponseBody
	 public User add() {
    	User user=new User();
    	
		 return user;
	 }
    
    @RequestMapping("/add2")
	public ModelAndView query() {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		modelAndView.setViewName("c");
		//modelAndView.setViewName("/WEB-INF/jsp/c.jsp");
		return modelAndView;
    }
    
    @RequestMapping("/add3")
    public ModelAndView field(String username,String password) {
    	ModelAndView modelAndView = new ModelAndView();
    	System.out.println(username);
    	System.out.println(password);
    	modelAndView.setViewName("c");
    	//modelAndView.setViewName("/WEB-INF/jsp/c.jsp");
    	return modelAndView;
    }
    @RequestMapping("/add4")
    @ResponseBody
    public User user(User user) {
    	System.out.println(user.getUsername());
    	System.out.println(user.getPassword());
    	return user;
    }
}
