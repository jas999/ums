package com.ums.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public ModelAndView showHelloMessage(ModelMap model) {
		model.addAttribute("message", "Hello Java the great");
		return new ModelAndView("home");
	}

}
