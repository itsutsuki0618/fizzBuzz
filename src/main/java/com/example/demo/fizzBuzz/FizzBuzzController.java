package com.example.demo.fizzBuzz;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzBuzzService) {
		this.fizzBuzzService = fizzBuzzService;
	}

	@GetMapping("fizzBuzz")
	public String fizzBuzz(Model model) {

		ArrayList<String> result = new ArrayList<String>();

		result = fizzBuzzService.FizzBuzz();

		model.addAttribute("result", result);

		return "fizzBuzz.html";
	}

}