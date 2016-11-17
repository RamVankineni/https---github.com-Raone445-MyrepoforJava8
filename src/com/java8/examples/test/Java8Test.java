package com.java8.examples.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.java8.examples.Employee;
import com.java8.examples.LambaExpressionModel;

public class Java8Test {

	private LambaExpressionModel model = null;
	private List<Employee> emps = null;
	@Before
	public void setUp() throws Exception {
		model= new LambaExpressionModel();
		emps = model.defaultElements();
	}

	@Test
	public void test() {
		
		Employee e = model.findEmployeeByID(emps, "22");
		assertEquals("22", e.getEid());
		
		
	}

}
