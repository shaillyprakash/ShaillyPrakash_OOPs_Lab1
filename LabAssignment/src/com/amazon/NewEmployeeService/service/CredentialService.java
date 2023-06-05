package com.amazon.NewEmployeeService.service;

import com.amazon.NewEmployeeService.model.Employee;

public interface CredentialService {
	
	
	public String generatePassword();
	public String generateEmailAddress (Employee emp, String department);
	public void showCredentials(Employee employee, String department);
	
}
