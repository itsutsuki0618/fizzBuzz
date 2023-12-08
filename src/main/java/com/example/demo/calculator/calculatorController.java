package com.example.demo.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class calculatorController {

	@GetMapping("calculator")
	public String doGet() {
		return "calculator.html";
	}

	@PostMapping("calculator")
	public String doPost(@RequestParam("firstNumber") int firstNumber, @RequestParam("operator") String operator,
			@RequestParam("secondNumber") int secondNumber, Model model) {

		int result = calculatorService.result(firstNumber, operator, secondNumber);
		model.addAttribute("result", result);

		return "calculator.html";
	}

}
