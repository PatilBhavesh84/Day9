package com.BridgeLabz.day9;

//import java.util.Scanner;

public class AddressBook {
	String firstName,lastName,address,city,state,emailId,zip,phoneNumber;
		
	AddressBook (String  firstName, String  lastName, String  address, String  city, String  state,
	           String  zip,String  emailId, String  phoneNumber){
		this.firstName=firstName;
      this.lastName=lastName;
      this.address=address;
      this.city=city;
      this.state=state;
      this.zip=zip;
      this.emailId=emailId;
      this.phoneNumber=phoneNumber;
	}

	void display() {
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
	public void ChangingZip (String n){
		 zip = n; 
	}
	public void ChangingPhoneNumber (String n){
		 phoneNumber = n; 
	}
	
  public String toString() {
      return	 firstName+" "+lastName+" Details "+"\nfirstName: " + firstName + "\nLastName: " + lastName + "\nAddress: "
              + address + "\nCity :"+city+"\nState: "+state+"\nEmailID: " +emailId+"\nPhoneNumber: "+ phoneNumber+"\nZip: "+zip;
  }
}