package com.encryptionproject;

import java.util.Scanner;

public class Explorer
{
	 public static void main(String[] args) 
	 	{
		 	Scanner sc = new Scanner(System.in);
		 	
		 	System.out.println("Welcome to the Message Encryptor.");
		 	System.out.println("Please enter the message you'd like to encrypt.");
		 	
		 	String userInput = sc.nextLine(); 
		 	
		 	System.out.println(Explorer.encrypt(userInput, 5));
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

