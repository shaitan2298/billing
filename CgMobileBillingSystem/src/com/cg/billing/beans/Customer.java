package com.cg.billing.beans;

import java.util.HashMap;

public class Customer 
{
     private int custId;
     private String firstName;
     private String lastName;
     private String phoneNumber;
     private String email;
     private String serviceOperator;
     public HashMap<Integer,Bill> bill = new HashMap<>();
     
     public Customer()
     {
    	 
     }

	public Customer(String firstName, String lastName, String phoneNumber, String email, String serviceOperator,
			HashMap<Integer, Bill> bill) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.serviceOperator = serviceOperator;
		this.bill = bill;
	}

	public Customer(int custId, String firstName, String lastName, String phoneNumber, String email,
			String serviceOperator, HashMap<Integer, Bill> bill) {
		super();
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.serviceOperator = serviceOperator;
		this.bill = bill;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

	public String getServiceOperator() {
		return serviceOperator;
	}

	public void setServiceOperator(String serviceOperator) {
		this.serviceOperator = serviceOperator;
	}

	public HashMap<Integer, Bill> getBill() {
		return bill;
	}

	public void setBill(HashMap<Integer, Bill> bill) {
		this.bill = bill;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bill == null) ? 0 : bill.hashCode());
		result = prime * result + custId;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((serviceOperator == null) ? 0 : serviceOperator.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bill == null) {
			if (other.bill != null)
				return false;
		} else if (!bill.equals(other.bill))
			return false;
		if (custId != other.custId)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (serviceOperator == null) {
			if (other.serviceOperator != null)
				return false;
		} else if (!serviceOperator.equals(other.serviceOperator))
			return false;
		return true;
	}

	public Customer(String firstName, String lastName, String phoneNumber, String serviceOperator) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.serviceOperator = serviceOperator;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", serviceOperator=" + serviceOperator + ", bill=" + bill + "]";
	}
     
    

	
     
	
}
