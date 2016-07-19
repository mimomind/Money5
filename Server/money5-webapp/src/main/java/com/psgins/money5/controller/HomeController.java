package com.psgins.money5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView HomePage(){
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}

}
