package com.emp.service;

import org.springframework.stereotype.Service;

@Service(value="empService")
public class EmployeeServiceImpl implements EmployeeService {

	
	public void test() {
		System.out.println("---- test...");
	}
}
