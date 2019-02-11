package com.cg.billing.util;

import java.util.HashMap;
import java.util.Random;

import com.cg.billing.beans.Customer;


public class BillingDBUtil
{
	public static HashMap<Integer, Customer> customer = new HashMap<>();
	public static int CUSTOMER_ID = 100;
	static private int n = 9999-1000;
	static Random bill= new Random();
	public static int BILL_AMOUNT = bill.nextInt(9999)%n;
	public static int getCUSTOMER_ID()
    {
    	return ++CUSTOMER_ID;
    }
	public static int BILL_ID = 500;
	public static int getBILL_ID()
	{
		return ++BILL_ID;
	}
}
