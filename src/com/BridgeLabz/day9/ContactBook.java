package com.BridgeLabz.day9;
import java.util.Scanner;
public class ContactBook {

	String firstName,lastName,address,city,state,emailId,phoneNumber;
	int zip;
	void getDetails() {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter first name: ");
		firstName=sc.nextLine();

		System.out.println("Enter last name: ");
		lastName=sc.nextLine();

		System.out.println("Enter address: ");
		address=sc.nextLine();

		System.out.println("Enter city: ");
		city=sc.nextLine();

		System.out.println("Enter state: ");
		state=sc.nextLine();

		System.out.println("Enter phone number");
		phoneNumber=sc.nextLine();

		System.out.println("Enter email id: ");
		emailId=sc.nextLine();

		System.out.println("Enter zip code");
		zip=sc.nextInt();
		sc.close();

	}

	void display() {
		System.out.println("Name:"+firstName+" "+lastName);
		System.out.println("Address:"+address);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		System.out.println("Phone Number:"+phoneNumber);
		System.out.println("Email Id:"+emailId);
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
