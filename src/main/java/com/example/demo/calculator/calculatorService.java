package com.example.demo.calculator;

public class calculatorService {
	public static int result(int firstNumber, String operator, int secondNumber) {
		
		int result = 0;
		
		switch (operator) {
		  case "plus":
			  result = firstNumber + secondNumber ;
			  break;
		  case "minus":
			  result = firstNumber - secondNumber ;
			  break;
		  case "times":
			  result = firstNumber * secondNumber ;
			  break;
		  case "devide":
			  result = firstNumber / secondNumber ;
			  break;
		}  
		
	    
		return result;
		
		
	}

}
