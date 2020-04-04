package org.studyeasy.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "hello"; //nom de la page jsp
	}
}