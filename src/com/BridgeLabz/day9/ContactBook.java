package com.BridgeLabz.day9;

//import java.util.HashMap;
//import java.util.Map;

public class ContactBook  {
	public ContactBook() {

	}

	public ContactBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj == this) {
			return true;
		}
		ContactBook contact = (ContactBook) obj; 

		if (contact.firstName.equals(this.firstName) && contact.lastName.equals(this.lastName)) {
			result = true;
		}
		return result;
	}
	@Override
	public String toString() {
		return "Contact{" + ",firstName='" + firstName + '\'' + ",lastName='" + lastName + '\'' + ",address='" + address
				+ '\'' + ",city='" + city + '\'' + ",state='" + state + '\'' + ",zip='" + zip + '\'' + ",phoneNumber='"
				+ phoneNumber + '\'' + ",email='" + email + '\'' + '}';
	}

}