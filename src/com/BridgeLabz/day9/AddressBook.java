package com.BridgeLabz.day9;
class AddressBook{
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		ContactBook Bhavesh = new ContactBook();
		Bhavesh.getDetails();
		System.out.println("Bhavesh's Details are :");
		Bhavesh.display();

		ContactBook Vinay = new ContactBook();
		Vinay.getDetails();
		System.out.println("Vinay's Details are :");
		Vinay.display();
	}  
}
