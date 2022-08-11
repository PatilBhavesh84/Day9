package com.BridgeLabz.day9;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);
	public String name;

	public ArrayList<ContactBook> addressBook = new ArrayList<>();

	public AddressBook(String name) {
		this.name = name;
	}

	public ArrayList<ContactBook> getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(ArrayList<ContactBook> addressBook) {
		this.addressBook = addressBook;
	}

	public boolean checkDuplicateEntry(ContactBook contact) {
		boolean status = false;
		for (ContactBook person : addressBook) {
			status = person.equals(contact);
		}
		return status;
	}

	public void addContact(ContactBook contact) {
		boolean duplicateStatus = checkDuplicateEntry(contact);
		if (!duplicateStatus) {
			addressBook.add(contact);
			System.out.println("Contact added successfully!");
		} else {
			System.out.println("The person already exists!");
		}
		System.out.println("AddressBook Data : " + addressBook);
	}

	// EDIT contact from the addressBook by the FIRSTNAME
	public void editContactByFirstName(String firstname) {
		String editName;
		Integer choice;
		for (ContactBook contact : addressBook) {
			editName = contact.getFirstName();
			if (firstname.equalsIgnoreCase(editName)) {
				do {
					System.out.println("1. Edit First name" + "\n" + "2. Edit Last name" + "\n" + "3. Edit Address "
							+ "\n"+ "4. Edit State" + "\n" + "5. Edit Zipcode " + "\n"
							+ "6. Edit Phone Number" + "\n" + "7. Edit Email" + "\n" + "0. EXIT" + "\n"
							+ "Enter your choice :");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter new first name:");
						String newFirstName = scanner.next();
						contact.setFirstName(newFirstName);
						System.out.println(contact);
						break;

					case 2:
						System.out.println("Enter new last name:");
						String newLastName = scanner.next();
						contact.setLastName(newLastName);
						System.out.println(contact);
						break;

					case 3:
						System.out.println("Enter new address:");
						String newAddress = scanner.next();
						contact.setAddress(newAddress);
						System.out.println(contact);
						break;

					case 4:
						System.out.println("Enter new state:");
						String newState = scanner.next();
						contact.setState(newState);
						System.out.println(contact);
						break;

					case 5:
						System.out.println("Enter new zipcode:");
						String newZipcode = scanner.next();
						contact.setZip(newZipcode);
						System.out.println(contact);
						break;

					case 6:
						System.out.println("Enter new phone number :");
						String newPhone = scanner.next();
						contact.setPhoneNumber(newPhone);
						System.out.println(contact);
						break;

					case 7:
						System.out.println("Enter new email id:");
						String newEmail = scanner.next();
						contact.setEmail(newEmail);
						System.out.println(contact);
						break;
					}
				} while (!choice.equals(0));
				System.out.println(contact);
			} else {
				System.out.println("There is no contact named  " + firstname + ". Try Again !!");
			}
		}
	}

	public void deleteContact(String firstname) {
		String deleteName;
		for (ContactBook contact : addressBook) {
			deleteName = contact.getFirstName();
			System.out.println(deleteName);
			if (firstname.equalsIgnoreCase(deleteName)) {
				addressBook.remove(contact);
				System.out.println("Contact name " + firstname + "deleted successfully from the contact list");
			} else {
				System.out.println("There is no contact named " + firstname + ". Please Enter a Valid Name!!");
			}
		}
	}
}