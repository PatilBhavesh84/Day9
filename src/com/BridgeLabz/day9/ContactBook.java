package com.BridgeLabz.day9;

import java.util.Scanner;

public class ContactBook {
	String firstName,lastName,address,city,state,emailId,phoneNumber;
	int zip;
	public void getDetails() {
		System.out.println("Enter new contact details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name");
		firstName = sc.nextLine();
		System.out.println("Enter Last Name");
		lastName=sc.nextLine();
		System.out.println("Enter Address ");
		address=sc.nextLine();
		System.out.println("Enter City Name");
		city=sc.nextLine();
		System.out.println("Enter State Name");
		state=sc.nextLine();
		System.out.println("Enter Email ID");
		emailId=sc.nextLine();
		System.out.println("Enter Phone number");
		phoneNumber=sc.nextLine();
		System.out.println("Enter Zip");
		zip=sc.nextInt();
	}

	public void display() {
		System.out.println(firstName+" "+lastName+" Details");
		System.out.println("Address: "+address);
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Zip: "+zip);
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Email Id: "+emailId);
	}

	public void ChangingFirstName (String n){
		firstName = n; 
	}
	public void ChangingLastName (String n){
		lastName = n; 
	}
	public void ChangingAddress (String n){
		address = n; 
	}
	public void ChangingCity(String n){
		city = n; 
	}
	public void ChangingState(String n){
		state = n; 
	}
	public void ChangingEmailName (String n){
		emailId = n; 
	}
	public void ChangingPhoneNumber (String n){
		phoneNumber = n; 
	}
	public void ChangingZip (int n){
		zip = n; 
	}
}