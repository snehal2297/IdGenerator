package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(generator = "employee-id-generator")
    @GenericGenerator(
            name = "employee-id-generator",
            strategy = "com.example.demo.generators.EmployeeIdGenerator"
    )
	private String eId;
	private String eName;
	private Integer eSalary;
	
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Integer geteSalary() {
		return eSalary;
	}
	public void seteSalary(Integer eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}
	
	

}
