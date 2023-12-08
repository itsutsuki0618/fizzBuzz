package com.example.demo.fizzBuzz;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public  ArrayList<String> FizzBuzz() {
		ArrayList <String> list =
				new ArrayList<String>();
		
		for (int i = 1; i <= 100; i++)
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
				list.add("FizzBuzz");
				
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
				list.add("Fizz");
				
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
				list.add("Buzz");
				
			} else {
				System.out.println(i);
				list.add(String.valueOf(i));
			}
		return list;
	}
}