package com.shalini.springbootbackend.repository;

import com.shalini.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

};

