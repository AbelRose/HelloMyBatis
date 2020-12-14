package com.matrix.day02.mapper;

import java.util.List;

import com.matrix.day02.bean.Dept;
import com.matrix.day02.bean.Emp;

public interface EmpDeptMapper {

	List<Emp> getAllEmp();
	
	Emp getEmpStep(String eid);
	
	Dept getDeptEmpsByDid(String did);
	
	Dept getOnlyDeptByDid(String did);
	
	List<Emp> getEmpListByDid(String did);
	
}
