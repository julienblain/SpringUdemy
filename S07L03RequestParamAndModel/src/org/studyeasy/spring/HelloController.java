package org.studyeasy.spring;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
 
@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "hello";
	}
	
	@RequestMapping(value="displayname") 
	public String displayName(@RequestParam("firstname") String firstName, Model model) {
		
		model.addAttribute("name", firstName);
		
		return "displayName";
	}
}