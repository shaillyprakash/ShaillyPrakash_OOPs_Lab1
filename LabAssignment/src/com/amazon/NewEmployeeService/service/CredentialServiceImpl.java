package com.amazon.NewEmployeeService.service;

import java.util.Random;

import com.amazon.NewEmployeeService.model.Employee;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generatePassword() {
		String numbers = "0123456789";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters= "abcdefghijklmnopqrstuvwxyz";
		String specailCharacter = "!@#$%^&*_+=-/.?<>";
		
		String values = numbers + capitalLetters + smallLetters + specailCharacter;
		
		Random random = new Random();
		String password = "";
		
		for (int i = 0; i < 8; i++) {
			password += values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
	
	@Override
	public String generateEmailAddress(Employee emp, String department) {
		
		return emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + department + ".amazon.com";
	}
	
	@Override
	public void showCredentials(Employee employee, String department) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + employee.getFirstName()+ " your generated credentials are as follows  ");
		System.out.println("Email   ---> " + generateEmailAddress(employee, department));
		System.out.println("Password---> " + generatePassword());
		
	}

}
