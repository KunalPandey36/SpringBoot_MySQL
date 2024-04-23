package com.kunaltut.kunalspring.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kunaltut.kunalspring.entity.Department;

@Repository
public interface DeptRepo extends JpaRepository<Department, Long> {

	public Department findByDeptNameIgnoreCase(String deptName);

}
