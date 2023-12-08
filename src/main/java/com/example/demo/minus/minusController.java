package com.example.demo.minus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class minusController {

	@GetMapping("minus")
	public String doGet() {
		return "minus.html";
	}

	@PostMapping("minus")
	public String doPost(@RequestParam("firstNumber") int firstNumber, @RequestParam("secondNumber") int secondNumber,
			Model model) {

		int result = 0;
		result = minusService.minus(firstNumber, secondNumber);
		model.addAttribute("result", result);

		return "minus.html";
	}
}