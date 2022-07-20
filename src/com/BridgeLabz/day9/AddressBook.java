package com.BridgeLabz.day9;

import java.util.*;

public class AddressBook {
	
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

	 void ChangingPhoneNumber (String a){
	 }
	 void DeletingName (String a) {
	}
	public static void main(String []args) {
		AddressBook obj=new AddressBook();
		obj.getDetails();
		obj.display();
		obj.ChangingPhoneNumber("7709364334");
		obj.display();
	    obj.DeletingName("null");  
	    obj.display();
	   
	}
    
}