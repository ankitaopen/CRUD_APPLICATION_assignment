package com.example.demo.repository

import org.springframework.data.repository.CrudRepository
import com.example.demo.model.Employee
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository : CrudRepository<Employee?, Long?>