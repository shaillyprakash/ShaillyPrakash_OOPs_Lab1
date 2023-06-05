package com.amazon.NewEmployeeService.main;

import java.util.Scanner;

import com.amazon.NewEmployeeService.model.Employee;
import com.amazon.NewEmployeeService.service.CredentialService;
import com.amazon.NewEmployeeService.service.CredentialServiceImpl;

public class EmailServiceApp {
	
	public static void main (String[] args)
	{
		CredentialService service = new CredentialServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name");
		String fn = sc.next();
		System.out.println("Enter Your Last Name");
		String ln = sc.next();
		Employee employee = new Employee(fn, ln);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		String department = "";
		
		int option = sc.nextInt();

		switch (option) {
		case 1:
			department ="tech";
			
			break;
		case 2:
			department ="admin";
			
			break;
		case 3:
			department ="hr";
			
			break;
		case 4:
			department ="legal";
			
			break;
		
			default:
				System.out.println("Please enter valid option");
				break;
		}
		
		String generatedEmail = service.generateEmailAddress(employee, department);
		String generatedPassword = service.generatePassword();
		service.showCredentials(employee, department);
		sc.close();
	}
}

