package com.example.udyrprojectv1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/v1")
public class Products {
	
	@GetMapping("/listarProdutos")
	public ModelAndView listarProdutos() {
		return new ModelAndView("productsSell");
	}

}