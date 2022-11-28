package com.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataControllers {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is home Url ");
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}

	@RequestMapping("/service")
	public String Service() {
		System.out.println("this is service url ");
		return "service";
	}

	@RequestMapping("help")
	public String help() {
		System.out.println("this is help url");
		return "help";
	}

}
