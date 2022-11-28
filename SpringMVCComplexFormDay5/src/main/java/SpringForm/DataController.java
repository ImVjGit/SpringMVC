package SpringForm;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Entity.Studnet;

@Controller
public class DataController {

	@RequestMapping("/form")
	public String form() {
		System.out.println("Springform");
		return "form";
	}

	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String handleform(@ModelAttribute("studnet")Studnet studnet)
	{	
			
		System.out.println(studnet);
		return "success";
	}
}
