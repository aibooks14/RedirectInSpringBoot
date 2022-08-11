package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	/*How to redirect in spring mvc
	 * 1. redirect prefix , in line 15
	 * RedirectView Datatype controller  in line 29
	 * */

	@RequestMapping("/one")
		public String one() {
			System.out.println("This is one handler");
			return "redirect:/two" ;
			//This will call the @RequestMapping("/two") handler
		}
		
	@RequestMapping("/two")
	public String two() {
		System.out.println("This is two handler");
		return "one" ;
	}
	
	//This is the another way to redirect , same as in line 15 method
	@RequestMapping("/one1")
	public RedirectView one1() {
		System.out.println("This is one1 handler with Redirect Type");
		RedirectView rv = new RedirectView() ;
//		rv.setUrl("/two") ;
		rv.setUrl("https://www.google.com") ;
		return rv  ;
		//This will call the @RequestMapping("/two") handler
	}
}




/*Use of redirect
 * if we want user must input the required parameters in the form.
 * if the parameter is blank then user again come back to the input form, like in example mentioned below
 * 
 * 		if (user.getName().isBlank()) {
			System.out.println("Name is not found, SO Redirect the form again");
			return "redirect:/form" ;
		}
 * */










