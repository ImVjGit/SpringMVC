package Com.DataController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataControllers {

	@RequestMapping("/home")
	public String home(Model model) {
//using model
		System.out.println("this is home Url ");

		model.addAttribute("name", "vijay Girange");
		model.addAttribute("idu", 152);

		List<String> fri = new ArrayList<String>();
		fri.add("Yanika");
		fri.add("Opnka");
		fri.add("Kaloka");
		model.addAttribute("f",fri);
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

	//ModelAndView
	@RequestMapping("help")
	public ModelAndView help() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("this is help url");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "I am Help page from Controller");
		modelAndView.addObject("rollnumber",555);
		modelAndView.addObject("time",now);
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
