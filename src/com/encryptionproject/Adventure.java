package com.encryptionproject;

import java.util.Scanner;

public class Adventure
{
	 public static void main(String[] args) 
	 	{
		 	boolean retry = true; 
		 	
		 	do
		 	{
				Scanner sc = new Scanner(System.in);
				String userInput = null; 
				
				System.out.println("Welcome to the Message Encryptor.");
				System.out.println("Please enter the message you'd like to encrypt.");
				
				userInput = sc.nextLine();
				String theMessageToBeEncrypted = userInput; 
				
				if(theMessageToBeEncrypted.matches("[a-z A-Z]+$")) 
				{
					System.out.println(Adventure.encrypt(theMessageToBeEncrypted, 5));
					System.out.println(Adventure.decrypt(Adventure.encrypt(theMessageToBeEncrypted, 5), 5) + "\n");
					}
					else
					{
					System.out.println("Numbers are not valid. Please type only letters.");
					}
			} while (retry);
		 	
	    }
	 
	    public static String decrypt(String encode, int shift)
	    {
	        return encrypt(encode, 26-shift);
	    }
	 
	    public static String encrypt(String encode, int shift)
	    {
	        shift = shift % 26 + 26;
	        StringBuilder encrypted = new StringBuilder();
	        for (char i : encode.toCharArray()) {
	            if (Character.isLetter(i)) {
	                if (Character.isUpperCase(i)) {
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
	    }
}

