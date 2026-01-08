package com.sample.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired
	public employeeRepo employeeRepo;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("employee "+new Gson().toJson(employee));
		return employeeRepo.save(employee);
	}
	
	@GetMapping("/getemployee")
	public List<Employee> getallEmployee(){
		return employeeRepo.findAll();
	}
	
	
	@GetMapping("/main")
	public String getapp() {
		
		return "hi welcome to uthaya page...... ";
	}
	
	

}
