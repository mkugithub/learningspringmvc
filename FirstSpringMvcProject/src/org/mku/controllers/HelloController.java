package org.mku.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	 @RequestMapping("/helloWorld/{countryName}/{userName}")
	 public ModelAndView helloWorld(@PathVariable Map<String ,String> pathVar){
		 
		  String country=pathVar.get("countryName");
		  String name=pathVar.get("userName");
		  
		  ModelAndView mav=new ModelAndView("helloWorld");
		  		  mav.addObject("welcomeMessage", "Welcome to : "+country+ " " +name);
		  return mav;
		  
		  
	  }
	 
	 @RequestMapping("/hi")
	 public ModelAndView hiWorld(){
		 
		 ModelAndView modelAndView=new ModelAndView("helloWorld");
		 modelAndView.addObject("hiMessage", "hi welocome");
		 return modelAndView;
		 
	 }

}
