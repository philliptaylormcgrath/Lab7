package co.grandcircus;

import java.util.Scanner;

//regex lab

//First method validates name. Letters only. Max length of 30. 
//Second method will validate email address. (Alphanumeric characters between 5 and 30)@(alphanumeric characters between 5-10, with no special characters).(domain can be combination of alphanumeric characters with a length of 2-3)
//Third method validate phone numbers. (Three digits hyphen three digits hyphen four digits)
//Fourth method will validate dates based on dd/mm/yyyy (hint: first number must be between 01-31 and second number must be between 01 and 12)
//Bonus Method - Validate HTML elements. <p> </p> is valid for instance

public class Lab7 {

	public static void main(String[] args) {
		
		String name;
		String email;
		String phone;
		String date;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your name: ");
		name = scan.nextLine();
		
		System.out.println(nameValidation(name));
		
		System.out.println("Please input your email address: ");
		email = scan.nextLine();
		
		System.out.println(emailValidation(email));
	
		
		System.out.println("Please input your phone number: ");
		phone = scan.nextLine();
		
		System.out.println(phoneValidation(phone));
		
		
		System.out.println("Please input a date: ");
		date = scan.nextLine();
		
		System.out.println(dateValidation(date));
		
		
		

	}

	// method here
	public static boolean nameValidation(String name) {
		return name.matches("[A-Z][a-z]{1,30}");
	}

	public static boolean emailValidation(String email) {
		return email.matches("(^([a-zA-Z\\d]{5,30}))[@][a-zA-Z\\d]{5,10}[.][a-zA-Z\\d]{2,3}"); //alphanumeric 5-30, @, alphanumeric 5-10, . , domain 2 or 3 alphabetic characters
	}

	public static boolean phoneValidation(String phone) {
		return phone.matches("(^[\\d]{3})[-][\\d]{3}[-][\\d]{4}");
	}

	public static boolean dateValidation(String date) {
		return date.matches("([\\d]{2}[/][\\d]{2}[/][\\d]{4})");
	}
}
