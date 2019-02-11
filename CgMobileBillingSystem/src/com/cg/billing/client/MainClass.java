package com.cg.billing.client;

import java.util.Scanner;

import com.cg.billing.exceptions.CustomerNotFoundException;
import com.cg.billing.exceptions.InvalidServiceOperator;
import com.cg.billing.services.BillingServices;
import com.cg.billing.services.BillingServicesImpl;

public class MainClass {
	static Scanner sc = new Scanner(System.in);
	static BillingServices services = new BillingServicesImpl();

	public static void main(String[] args) throws CustomerNotFoundException, InvalidServiceOperator
	{
		menu();
		int choice = sc.nextInt();
		mainScreen(choice);
	}
	public static void mainScreen(int choice) throws CustomerNotFoundException, InvalidServiceOperator 	{
		switch(choice)
		{
		case 1: System.out.println("Enter firstName: ");
					String fName = sc.next();
					System.out.println("Enter lastName: ");
					String lName = sc.next();
					System.out.println("Enter mobileNo: ");
					String mobNo = sc.next();
					System.out.println("Enter your service operator: ");
					String serviceOperator = sc.next();
					System.out.println("Your bill status is: ");
					System.out.println(services.getCustomerId(fName,lName,mobNo,serviceOperator));
		break;
		case 2: System.out.println("Enter customer id: ");
		int customerId = sc.nextInt();
		System.out.println("Enter service operator: ");
		String operator = sc.next();
		System.out.println(services.getBill(customerId,operator));
		break;
		default: System.out.println("Invalid Choice!");
		}
		
		System.out.println("What do you want to do now?");
    	System.out.println("1. Continue \n 2. Exit");
    	int select = sc.nextInt();
    	if(select == 2)
    		System.exit(0);
    	main(null);
	}
	public static void menu()
	{
		System.out.println("1. Get Customer Details");
		System.out.println("2. Show Bill Status");
		System.out.println("3. Get Bill");
	}

}
