package com.formation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Bienvenue sur mon site");
		model.addAttribute("tagline", "Ici on aime le bon vin !");

		return "welcome";
	}
}
