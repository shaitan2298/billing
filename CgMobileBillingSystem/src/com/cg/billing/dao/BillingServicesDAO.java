package com.cg.billing.dao;

import java.util.List;

import com.cg.billing.beans.Customer;

public interface BillingServicesDAO 
{
     Customer save(Customer customer);
     Customer findOne(int custId);
     List<Customer> findAll();
}
