package com.BridgeLabz.day9;

import java.util.HashMap;
import java.util.Map;

public class ContactBook  {

	public static void main(String[] args) {

		Map<String,AddressBook> map=new HashMap<String,AddressBook>();    

		AddressBook Bhavesh = new AddressBook("Bhavesh","Patil","44 Vasant nagar ","Nizar","Gujarat",
				"425409","bhavesh@gmail.com","9975543019");   
		AddressBook Vinay = new AddressBook("Vinay","Shimpi","40 Govind nagar","Shahada","Maharashtra",
				"425411","vinay4@gmail.com","9954565124");   
		AddressBook Pulkit = new AddressBook ("Pulkit","Chopra","33 Vijay nagar","Indore","Madhya Pradesh",
				"432112","pulkit12@gmail.com","8864531246");    
		AddressBook Ritik = new AddressBook ("Ritik","Manglani","12 Sindhi Colony","Nandurbar","Maharashtra",
				"432112","pulkit12@gmail.com","7798457166"); 
		map.put("Bhavesh",Bhavesh);  
		map.put("Vinay",Vinay);  
		map.put("Pulkit",Pulkit);  
		map.put("Ritik", Ritik);
		
		for(Map.Entry<String,AddressBook> entry:map.entrySet()){    

			AddressBook p = entry.getValue();  
			System.out.println(p.firstName+" "+p.lastName+" Details \nfirstName: "+p.firstName +"\nLastName: " +p.lastName + "\nAddress: "
					+ p.address + "\nCity :"+p.city+"\nState: "+p.state+"\nEmailID: " +p.emailId+"\nPhoneNumber: "+ p.phoneNumber+"\nZip: "+p.zip);   
			System.out.println();
		}
		int countOfPersonByCityName = 0;
		for(Map.Entry<String,AddressBook> entry:map.entrySet()){    
			AddressBook p = entry.getValue();
			
			if (p.city.equals("Shahada")) {
				System.out.println(p.firstName+" "+p.lastName+" Details \nfirstName: "+p.firstName +"\nLastName: " +p.lastName + "\nAddress: "
						+ p.address + "\nCity :"+p.city+"\nState: "+p.state+"\nEmailID: " +p.emailId+"\nPhoneNumber: "+ p.phoneNumber+"\nZip: "+p.zip);   
				System.out.println();
				countOfPersonByCityName++;
			}
		}
		if(countOfPersonByCityName==0) {
			System.out.println("Record not found");
		}
		System.out.println("In shahada their are "+countOfPersonByCityName+" number of people");

		int countOfPersonByStateName = 0;
		for(Map.Entry<String,AddressBook> entry:map.entrySet()){    

			AddressBook p = entry.getValue();

			if (p.state.equals("Maharashtra")) {
				System.out.println(p.firstName+" "+p.lastName+" Details \nfirstName: "+p.firstName +"\nLastName: " +p.lastName + "\nAddress: "
						+ p.address + "\nCity :"+p.city+"\nState: "+p.state+"\nEmailID: " +p.emailId+"\nPhoneNumber: "+ p.phoneNumber+"\nZip: "+p.zip);   
				System.out.println();
				countOfPersonByStateName++;
			}
		}
		if(countOfPersonByStateName==0) {
			System.out.println("Record not found");
		}
		System.out.println("In Maharashtra there are "+countOfPersonByStateName+" number of people");
	}
}