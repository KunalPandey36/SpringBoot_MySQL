package com.kunaltut.kunalspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kunaltut.kunalspring.entity.Department;
import com.kunaltut.kunalspring.error.DepartmentNotFoundException;
import com.kunaltut.kunalspring.repository.DeptRepo;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepo dprep;
	
	@Override
	public Department saveDept(Department dept) {
		
		return dprep.save(dept);
	}

	@Override
	public List<Department> getAllTheDept() {
		// TODO Auto-generated method stub
		return dprep.findAll();
	}


	@Override
	public Department getDeptById(Long departid) throws DepartmentNotFoundException {
		// TODO Auto-generated method stub
		Optional<Department> dept = dprep.findById(departid);
		
		if(!dept.isPresent()) {
			throw new DepartmentNotFoundException("No Such ID is present");
		}
		
		return dept.get();
	}

	@Override
	public void deleteDeptById(Long departId) {
		// TODO Auto-generated method stub
		dprep.deleteById(departId);
	}

	@Override
	public Department updateDeptDetails(Long departId, Department dept) {
		// TODO Auto-generated method stub
		
		Department dp1 = dprep.findById(departId).get();
		
		if(dept.getDeptName()!=null) {
			dp1.setDeptName(dept.getDeptName());
		}
		if(dept.getDeptAddress()!=null) {
			dp1.setDeptAddress(dept.getDeptAddress());
		}
		if(dept.getDeptCode()!=null) {
			dp1.setDeptCode(dept.getDeptCode());
		}
//		dp1.setDeptName(dept.getDeptName());
//		dp1.setDeptAddress(dept.getDeptAddress());
//		dp1.setDeptCode(dept.getDeptCode());
		
		
		return dprep.save(dp1);
	}

	@Override
	public Department fetchDeptByName(String deptName) {
		// TODO Auto-generated method stub
		return dprep.findByDeptNameIgnoreCase(deptName);
	}

}
