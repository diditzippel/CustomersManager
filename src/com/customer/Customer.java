package com.customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String mail;
	private String phone;
	private String adress;
	private String city;
	private String state;
	public static List<Customer> listFromJsonObject = new ArrayList<Customer>();

	public Customer() {}
	
	public Customer(String firstName, String lastName, String mail, String phone, String adress, String city, String state, List<String> listFromJsonObject) {
       System.out.println("Constructing an Customer");
       this.firstName = firstName;
       this.lastName = lastName;
       this.mail = mail;
       this.phone = phone;
       this.adress = adress;
       this.city = city;
       this.state = state;
//       this.listFromJsonObject = listFromJsonObject;
    }
	
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
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
	
//	public List<String> getListFromJsonObject() {
//		return listFromJsonObject;
//	}
//
//	public void setListFromJsonObject(List<String> listFromJsonObject) {
//		this.listFromJsonObject = listFromJsonObject;
//	}
	
   
    public double computePay() {
      System.out.println("Inside Employee computePay");
      return 0.0;
    }
   
    public void onlyCheck() {
       System.out.println("Hi " + this.firstName + " " + this.lastName);
    }

    public String toString() {
       return firstName + " " + lastName + " ";
    }
    
}
