package com.cg.billing.services;

import com.cg.billing.beans.Customer;
import com.cg.billing.exceptions.CustomerNotFoundException;
import com.cg.billing.exceptions.InvalidServiceOperator;

public interface BillingServices 
{
	public int getCustomerId(String firstName, String lastName, String mobNumber, String serviceOperator);
	
     public int getBill(int custId, String serviceOperator) throws CustomerNotFoundException,InvalidServiceOperator;
     
     //public Customer showStatusOfBill(int custId) throws CustomerNotFoundException;
     
     
}
