package org.studyeasy.spring;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "hello";
	}
	
//	@RequestMapping(value="displayname") //valeur questionnaire
//	public String displayName(@RequestParam("firstname") String firstName, Model model) {
//		
//		model.addAttribute("name", firstName);
//		
//		return "displayName"; //retourne la vue et les data sont dans l'objet Model accessible en view
//	}
	
	@GetMapping("displayname") //valeur questionnaire avec spécification
	public ModelAndView displayName(@RequestParam("firstname") String firstName) {
		ModelAndView modelAndView = new ModelAndView("displayName");
		modelAndView.addObject("name", firstName);
		
		Date date = new Date();
		modelAndView.addObject("date", date);
		
		List<String> names = new ArrayList<>();
		names.add("jul");
		names.add("alex");
		names.add("lo");
		names.add("nedj");
		
		modelAndView.addObject("team", names);
		
		return modelAndView; //retourne la vue et les data dans un meme objet, plus propre
	}
}