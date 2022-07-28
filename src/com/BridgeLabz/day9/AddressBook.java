package com.BridgeLabz.day9;

//import javax.print.event.PrintJobListener;

class AddressBook{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		ContactBook Amit = new ContactBook();
		Amit.getDetails();
		System.out.println("Amit Details are :");
		Amit.display();
//		Amit.ChangingCity("Kerla");
//		Amit.display();
//		Deleting Contact details
//		Amit = nul;
		//Creating new Contact
		ContactBook Rahul = new ContactBook();
		Rahul.getDetails();
		System.out.println("Rahul Details are :");
		Rahul.display();
	}  
}