package com.encryptionproject;

import java.util.Scanner;

import com.encryptionproject.Validator;

public class EpicMode 
{
	static boolean retry = true; 

	public static void main(String[] args) 
	{
		String userInput = null; 
		String menuChoice = null; 
		String theMessageToBeEncrypted = userInput; 
		int userShift = 0; 
		int randomShift = 0; 
		
		Scanner sc = new Scanner(System.in);
		Scanner shiftNumber = new Scanner(System.in); 
		
		do
		{	
			System.out.println("Welcome to the Message Encryptor.");
			System.out.println("To select an option, please use the menu below:");
			System.out.println("\n\t 1. Encrypt a message with a shift of 5." + "\n\t 2. Encrypt a message with a shift of your choosing." + "\n\t 3. Encrypt a message with a random shift."
						+ "\n\t 4. Exit.");
			menuChoice = sc.nextLine();
			
			switch(menuChoice)
			{
				case "1":
				System.out.println("Enter the message you'd like to encrypt.");
				userInput = sc.nextLine();
				theMessageToBeEncrypted = userInput;
				encrypt(theMessageToBeEncrypted, 5);
				System.out.println(encrypt(theMessageToBeEncrypted, 5));
				break;

				case "2":
				System.out.println("Enter the message you'd like to encrypt.");
				userInput = sc.nextLine();
				theMessageToBeEncrypted = userInput;
				System.out.println("Enter the number of shifts.");
				userShift = shiftNumber.nextInt();
				encrypt(theMessageToBeEncrypted, userShift);
				System.out.println(encrypt(theMessageToBeEncrypted, userShift));
				break;

				case "3":
				randomShift = (int)(Math.random() * 26) + 1;
				System.out.println("Enter a message to encrypt.");
				userInput = sc.nextLine();
				theMessageToBeEncrypted = userInput;
				encrypt(theMessageToBeEncrypted, randomShift);
				System.out.println(encrypt(theMessageToBeEncrypted, randomShift));
				break;

				case "4":
				System.out.println("Thank you for visiting the Message Encryptor. Goodbye!");
				System.exit(0);
			}//switch

					
			}//do
			while(retry == true);  
			
	}//main
		public static String decrypt(String encode, int shift)
	    {
	        return encrypt(encode, 26-shift);
	    }
	 
	    public static String encrypt(String encode, int shift)
	    {
	        shift = shift % 26 + 26;
	        StringBuilder encrypted = new StringBuilder();
	        for (char i : encode.toCharArray()) 
	        {
	            if (Character.isLetter(i)) 
	            {
	                if (Character.isUpperCase(i)) 
	                {
	                    encrypted.append((char) ('A' + (i - 'A' + shift) % 26));
	                } 
	            else 
	            	{
	            		encrypted.append((char) ('a' + (i - 'a' + shift) % 26));
	            	}
	                
	            } 
	            
	            else 
	            	{
	            		encrypted.append(i);
	            	}
	        }
	        return encrypted.toString().toUpperCase();
	    }//end encrypt
	 
}//class

