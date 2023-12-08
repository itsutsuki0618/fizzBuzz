package com.example.demo.animalsAPI.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsAPI.data.Animals;
import com.example.demo.animalsAPI.repository.AnimalsRepository;

@Service
public class AnimalsService {

	private final AnimalsRepository animalsRepository;

	public AnimalsService(AnimalsRepository animalsRepository) {
		this.animalsRepository = animalsRepository;
	}

	public List<Animals> getAnimalsList() throws IOException {

		Animals[] animalsList = animalsRepository.getAnimalsList();

		return Arrays.asList(animalsList);
	}

	public Animals[] getAnimalById(int animalId) throws IOException {

		return animalsRepository.getAnimalsById(animalId);
	}

}