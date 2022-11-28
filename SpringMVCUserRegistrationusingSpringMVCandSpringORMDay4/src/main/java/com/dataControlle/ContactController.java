package com.dataControlle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showFrom() {

		return "contact";
	}

	/*
	 * using normal Method
	 * 
	 * @RequestMapping(path ="/processFrom",method =RequestMethod.POST) public
	 * String handlerfrom(HttpServletRequest request) { String email =
	 * request.getParameter("email"); String user =
	 * request.getParameter("userName"); String pass =
	 * request.getParameter("userPassword"); System.out.println(email);
	 * System.out.println(user); System.out.println(pass);
	 * 
	 * return ""; }
	 */

	// using class

	/*
	 * @RequestMapping(path = "/processFrom", method = RequestMethod.POST) public
	 * String handlerfrom(@RequestParam("email") String
	 * useremail,@RequestParam("userName") String
	 * username,@RequestParam("userPassword") String userPass ,Model model) {
	 * System.out.println(useremail);
	 * 
	 * System.out.println(username); System.out.println(userPass);
	 * 
	 * 
	 * User user = new User(); user.setUserName(username);
	 * user.setUserPassword(username); user.setEmail(useremail);
	 * System.out.println(user);
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * //taking to another page with dynamic value
	 * model.addAttribute("name",username); model.addAttribute("pass",userPass);
	 * model.addAttribute("email",useremail); return "success"; }
	 */

	
	//best way to use 
	@RequestMapping(path = "/processFrom", method = RequestMethod.POST)
	public String handlerfrom(@ModelAttribute User user, Model model) {
		

		return "success";
	}
	
	
	
	//always run this both
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("header", "I ma best ");
		m.addAttribute("Footer", "copyWrite");
		
	}
	
	
}
