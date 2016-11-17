package com.java8.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * This solution is to demonstrate lamdas/streams available in Java 8. And this deals with List of Employees
 * @author Ramu
 *
 */
public class LambaExpressionModel {

	public Employee findEmployeeByID(List<Employee> listOfEmployees, String eid){
		Employee e1 = listOfEmployees.stream().filter(x -> "22".equals(x.getEid())).findAny().orElse(null);
		
		return e1;
	}
	public List<Employee> defaultElements() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("21","Ram"));
		list.add(new Employee("22","Raj"));
		list.add(new Employee("23","Vishal"));
		list.add(new Employee("33","Kejar"));
		
		return list;
	}
	
}
