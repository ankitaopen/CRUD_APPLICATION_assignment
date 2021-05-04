package com.example.demo;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class CrudApplicationAssignmentApplicationTests {

////	@Test
////	void contextLoads()
////	{
//	}
	@Autowired
	EmployeeRepository employeeRepository;
	//unit test case to save product details to the database
	//creating test case for create or save operation
	//TEST CASE FOR SAVE OPERATION
	@Test
	@Order(1)
	public void employeeTest()
	{
		Employee e = new Employee();
		e.setId(1L);
		e.setFirstName("ankita");
		e.setLastName("sahoo");
		e.setEmailId("ankita.sahoo@bankopen.co");
		employeeRepository.save(e);
		//with this we are saving the above information to the database
		//using assertNotNull to write the test case
		assertNotNull(employeeRepository.findById(1L).get());
		//with this we are going to get the employee details with the employee id
		//and check if its not null
		//this becomes true
		//and the test case should run

	}
	//test case for read operation
	//unit test case to read all the employee details from the database
	//TEST CASE FOR READ OPERATION
	@Test
	@Order(2)
	public void readAllTest()
	{
		List<Employee> list = employeeRepository.findAll();
		//currently there are 5 records in our db
		assertThat(list).size().isGreaterThan(0);
	}
	//read single record
	//unit test case to read single employee from database
	@Test
	@Order(3)
	public void singleEmployeeTest()
	{
		Employee employee = employeeRepository.findById(1L).get();
		//this get() method gives the employee with id 1
		//with the assertEquals() method we can check the:
		//first_name,last_name,email,salary,department
		//enter any of the above value to fetch the respective employee details
		assertEquals("sahoo",employee.getLastName());
	}
	//TEST CASE FOR UPDATE OPERATION
	@Test
	@Order(4)
	public void updateEmployeeTest()
	{
		Employee e = employeeRepository.findById(1L).get();
		//retrieving details of employee with id 1
		e.setFirstName("nicky");
		employeeRepository.save(e);
		assertNotEquals("abhilash",employeeRepository.findById(1L).get().getFirstName());
		//here the first name is changed to nicky
		//we are checking with assertNotEquals method and passing abhilash as the first_ name
		//with this the method should returns true and the test case will pass
	}
	//TEST CASE FOR DELETE OPERATION
	@Test
	@Order(5)
	public void deleteEmployeeTest()
	{
		employeeRepository.deleteById(1L);
		assertThat(employeeRepository.existsById(1L)).isFalse();
		//as id 1 is already deleted
		//isFalse() will return true

	}
}
//to run all the test cases at the same time we have to specify the order
//or else the test case will fail