package com.nema.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index(@RequestParam(value="firstname", defaultValue="Human") String firstname, @RequestParam(value="lastname", defaultValue="Human") String lastname) {
		model.addAttribute("firstname:");
		model.addAttribute("lastname", "");
		if(!lastname.equals("lastname")) {
			model.addAtrribute("lastname", " "+lastname);
		}
	
	return "index.jsp";
}