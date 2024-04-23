package com.kunaltut.kunalspring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kunaltut.kunalspring.entity.Department;
import com.kunaltut.kunalspring.error.DepartmentNotFoundException;
import com.kunaltut.kunalspring.service.DeptService;

import jakarta.validation.Valid;


@RestController
public class DeptController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(Department.class);
	
	@Autowired
	private DeptService service;
	
	@PostMapping("/department")
	public Department saveDept(@Valid @RequestBody Department dept) {
		LOGGER.info("Inside save Deapartment");
		return service.saveDept(dept);
	}
	
	@GetMapping("/department")
	public List<Department> getAllDept(){
		LOGGER.info("Inside getAllDept");
		return service.getAllTheDept();
	}
	
	@GetMapping("/department/{id}")
	public Department getDeptById(@PathVariable("id") Long departid) throws DepartmentNotFoundException {
		return service.getDeptById(departid);
	}
	
	@DeleteMapping("/department/{id}")
	public String deleteDeptById(@PathVariable("id") Long departId) {
		service.deleteDeptById(departId);
		return "Deleted Succesfully";
	}
	
	@PutMapping("/department/{id}")
	public Department updateDeptDetails(@PathVariable("id") Long departId,
			@RequestBody Department dept) {
		return service.updateDeptDetails(departId,dept);
		
	}
	
	@GetMapping("/department/name/{name}")
	public Department fetchByName(@PathVariable("name") String deptName){
		return service.fetchDeptByName(deptName);
	}
}
