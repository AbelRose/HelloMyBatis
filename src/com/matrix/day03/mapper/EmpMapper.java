package com.matrix.day03.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.matrix.day03.bean.Emp;

public interface EmpMapper {

	//根据eid,ename,age,sex多条件查询员工信息
	List<Emp> getEmpListByMoreTJ(Emp emp);
	
	//根据eid,ename,age,sex中的其中一个查询一个员工信息
	List<Emp> getEmpListByChoose(Emp emp);
	
	//添加员工信息，将0|1-->女|男
	void insertEmp(Emp emp);
	
	//通过eid所组成的字符串实现批量删除
	void deleteMoreEmp(String eids);
	
	//通过list集合实现批量删除
	void deleteMoreByList(@Param("eids") List<Integer> eids);
	
	//批量添加
	void insertMoreByArray(@Param("emps") Emp[] emps);
	
	//批量修改
	void updateMoreByArray(@Param("emps") Emp[] emps);
	
	//根据eid查询员工信息
	Emp getEmpByEid(String eid);
}
