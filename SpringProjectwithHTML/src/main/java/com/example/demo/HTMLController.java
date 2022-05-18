package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HTMLController {
	
	@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	public String helloWorld()
	{
	// The html file name is helloWorldPage.html.
	return "index";
	}


}
