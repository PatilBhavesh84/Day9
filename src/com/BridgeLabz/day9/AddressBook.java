package com.BridgeLabz.day9;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println("Welcome to Address book Program");
		ContactBook Bhavesh = new ContactBook();
		Bhavesh.getDetails();
		System.out.println("Bhavesh Details are :");
		Bhavesh.display();

		ContactBook Vinay = new ContactBook();
		Vinay.getDetails();
		System.out.println("Vinay Details are :");
		Vinay.display();
	}
}