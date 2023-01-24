package com.shalini.springbootbackend;

import com.shalini.springbootbackend.model.Employee;
import com.shalini.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Sowmya");
		employee.setLastName("Varvala");
		employee.setEmailId("shalini@gamil.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("John");
		employee1.setLastName("Cena");
		employee1.setEmailId("cena@gmail.com");
		employeeRepository.save(employee1);
	}
}
