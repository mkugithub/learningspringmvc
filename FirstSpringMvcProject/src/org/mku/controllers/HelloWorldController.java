package org.mku.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController  extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside the handleRequestInternal Method");
		ModelAndView model=new ModelAndView("helloWorld");
		model.addObject("msg","Welcome to my first spring mvc Example");
		
		return model;
	}

}
