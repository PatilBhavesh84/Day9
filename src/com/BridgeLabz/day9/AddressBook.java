package com.BridgeLabz.day9;

import java.util.*;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book program ");
		String firstName,lastName,address,city,state,emailId,phoneNumber;
		int zip;
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
        
        
        //printing output  
        
        
        System.out.println("Name:"+firstName+" "+lastName);
        System.out.println("Address:"+address);
        System.out.println("City:"+city);
        System.out.println("State:"+state);
        System.out.println("Phone Number:"+phoneNumber);
        System.out.println("Email Id:"+emailId);
         

	}
}
