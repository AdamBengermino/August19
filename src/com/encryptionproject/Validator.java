package com.encryptionproject;

public class Validator
{
	public static boolean userInputFromMenu(String menuChoice, boolean correctInput)
	{
		switch(menuChoice)
		{
		case "1":
		case "2":
		case "3":
		case "4": 
			correctInput = false; 
			break; 
			default: 
				System.out.println("I'm sorry that is not a valid option.");
		}
		return correctInput;
	}
}
		

