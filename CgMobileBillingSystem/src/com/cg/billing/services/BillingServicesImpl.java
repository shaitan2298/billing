package com.cg.billing.services;

import com.cg.billing.beans.Bill;
import com.cg.billing.beans.Customer;
import com.cg.billing.dao.BillingServicesDAO;
import com.cg.billing.dao.BillingServicesDAOImpl;
import com.cg.billing.exceptions.CustomerNotFoundException;
import com.cg.billing.exceptions.InvalidServiceOperator;
import com.cg.billing.util.BillingDBUtil;

public class BillingServicesImpl implements BillingServices
{
	private BillingServicesDAO services;
	
	public BillingServicesImpl() 
	{
		services = new BillingServicesDAOImpl();
	}
	public BillingServicesImpl(BillingServicesDAO services)
	{
		super();
		this.services = services;
	}
	@Override
	public int getCustomerId(String firstName, String lastName, String mobNumber, String serviceOperator) {
		Customer customer = new Customer(firstName, lastName, mobNumber, serviceOperator);
		customer = services.save(customer);
		return customer.getCustId();
	}

	@Override
	public int getBill(int custId, String serviceOperator) throws CustomerNotFoundException, InvalidServiceOperator {
		Customer customer = services.findOne(custId);
		if(customer == null)
			throw new CustomerNotFoundException("Customer Not Found!");
		if(serviceOperator.equalsIgnoreCase(customer.getServiceOperator())) {
		Bill bills = new Bill();
		Integer bill = BillingDBUtil.getBILL_ID();
		int bill_id = bill;
		bills.setBill_id(bill_id);
		bills.setAmount(BillingDBUtil.BILL_AMOUNT);
		int billAmount = bills.getAmount();
		int finalAmount = billAmount + (10*billAmount)/100 + (20*billAmount)/100;
		return finalAmount;}
		else
			throw new InvalidServiceOperator("Invalid Service Operator!");
	}

	/*
	 * @Override public Customer showStatusOfBill(int custId) throws
	 * CustomerNotFoundException { Customer customer = services.findOne(custId);
	 * if(customer == null) throw new
	 * CustomerNotFoundException("Customer Not Found!"); return null; }
	 */
	
    
}
