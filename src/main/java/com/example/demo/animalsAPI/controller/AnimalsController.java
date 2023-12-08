package com.example.demo.animalsAPI.controller;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.animalsAPI.data.Animals;
import com.example.demo.animalsAPI.service.AnimalsService;


@Controller
public class AnimalsController {

	private final AnimalsService animalsService;

	public AnimalsController(AnimalsService animalsservice) {
		this.animalsService = animalsservice;
	}

	@GetMapping("animalsSearch")
	public String getAnimalsList(Model model) throws IOException {
		
		List<Animals> animalsList = animalsService.getAnimalsList();

		model.addAttribute("animalsList", animalsList);
		
		return "animalsSearch";
	}

	
	@GetMapping("animalsDetail")
	public String getAnimals(@RequestParam("animalId")int animalId, Model model) throws IOException {

		Animals[] animalsDetail = animalsService.getAnimalById(animalId);

		model.addAttribute("animalsDetail", animalsDetail);

		return "animalsDetail";
	}

}