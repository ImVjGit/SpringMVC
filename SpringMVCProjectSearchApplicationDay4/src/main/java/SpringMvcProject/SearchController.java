package SpringMvcProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	//for home page 
	@RequestMapping("/home")
	public String home() {
		System.out.println("home Page  ");
		return "home";
	}

	// Validation for home search data 
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("searchbox") String query) {
		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {
			String old = "redirect:/home";
			redirectView.setUrl(old);
			return redirectView;
		}
		String googleurl = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(googleurl);
		return redirectView;
	}

	//for video page 
	@RequestMapping("/searchvideo")
	public String searchvideo() {
		System.out.println("video Page  ");
		return "searchvideo";
	}
	// validation for video page  data
	@RequestMapping("/video")
	public RedirectView searchVideo(@RequestParam("searchvideobox") String query) {
		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {
			String old = "redirect:/searchvideo";
			redirectView.setUrl(old);
			return redirectView;
		} else {
			String youtubeUrl = "https://www.youtube.com/results?search_query=" + query;
			redirectView.setUrl(youtubeUrl);
			return redirectView;
		}
	}
}
