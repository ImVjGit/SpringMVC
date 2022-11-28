package com.dataControlle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectType {

	@RequestMapping("/one")
	//using type 1 redirect prifix 
	public String one()
	{
		System.out.println("this is one ");
		return "redirect:/two";
	}

	@RequestMapping("/two")
	public String two()
	{
		System.out.println("this is 2nd ");
		return "";
	}
	
	//using type 2 redirect view
	@RequestMapping("/three")	
	public RedirectView three()
		{
			System.out.println("this is one ");
			
			RedirectView obj = new RedirectView();
			obj.setUrl("contact");
			//obj.setUrl("/contact");note : in live project mention / before page name 
			
			return obj;
		}
	
	
}
