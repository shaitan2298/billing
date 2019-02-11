package com.cg.billing.dao;

import java.util.ArrayList;
import java.util.List;

import com.cg.billing.beans.Customer;
import com.cg.billing.util.BillingDBUtil;

public class BillingServicesDAOImpl implements BillingServicesDAO
{

	@Override
	public Customer save(Customer customer) {
		customer.setCustId(BillingDBUtil.getCUSTOMER_ID());
		BillingDBUtil.customer.put(customer.getCustId(), customer);
		return customer;
	}

	@Override
	public Customer findOne(int custId) {
		return BillingDBUtil.customer.get(custId);
	}

	@Override
	public List<Customer> findAll() {
		ArrayList<Customer> customer = new ArrayList<>(BillingDBUtil.customer.values());
		return customer;
	}

}
