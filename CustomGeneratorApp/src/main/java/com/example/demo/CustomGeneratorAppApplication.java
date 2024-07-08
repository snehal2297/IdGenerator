package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repository.EmlpoyeeIdRepository;

@SpringBootApplication
public class CustomGeneratorAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomGeneratorAppApplication.class, args);
		EmlpoyeeIdRepository bean = context.getBean(EmlpoyeeIdRepository.class);
		
		EmployeeDetails details=new EmployeeDetails();
		details.seteName("Snehal");
		details.seteSalary(1200000);
		bean.save(details);
	}

}
