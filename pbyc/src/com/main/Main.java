package com.main;

import com.emp.Employee;
import com.manager.Manager;

public class Main {
public static void main(String[] args) {
	Employee employee = new Employee();
	Manager manager = new Manager();
	
	System.out.println(employee.sal(25000, 2000));
	System.out.println(manager.sal(25000, 2000, 500));
}
}