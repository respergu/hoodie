package org.pivotal.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value = "/showMessage")
	public ModelAndView  helloWorld(ModelAndView model) {
    	model.addObject("message", "Hello World ! \n Ricardo Espergue will code for a hoodie !!");
    	model.setViewName("showMessage");
    	return model;
	}
	
}
