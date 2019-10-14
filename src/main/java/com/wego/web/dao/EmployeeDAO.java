package com.wego.web.dao;

import org.springframework.stereotype.Repository;

import com.wego.web.domains.DepartmentDTO;
import com.wego.web.domains.EmployeeDTO;
@Repository
public interface EmployeeDAO {
	public void insertEmployee(EmployeeDTO param);
	public EmployeeDTO selectByempNoeName(EmployeeDTO param,DepartmentDTO db);
}
