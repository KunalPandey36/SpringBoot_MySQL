package com.kunaltut.kunalspring.service;

import java.util.List;

import com.kunaltut.kunalspring.entity.Department;
import com.kunaltut.kunalspring.error.DepartmentNotFoundException;

public interface DeptService {

	public Department saveDept(Department dept);

	public List<Department> getAllTheDept();

	public Department getDeptById(Long departid) throws DepartmentNotFoundException;

	public void deleteDeptById(Long departId);

	public Department updateDeptDetails(Long departId, Department dept);

	public Department fetchDeptByName(String deptName);

}
