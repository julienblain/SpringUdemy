package org.studyeasy.spring;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
 
@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "hello";
	}
	
	@RequestMapping(value="displayname") //recuperation en get du form, value n'est pas obligatoire
	public String displayName(HttpServletRequest request) {
		String firstname = request.getParameter("firstname"); //recuperaiton data from request
		request.setAttribute("firstname", firstname);
		
		return "displayName";
	}
}