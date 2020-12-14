package com.matrix.day02;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.matrix.day02.bean.Dept;
import com.matrix.day02.mapper.EmpDeptMapper;
import com.matrix.day02.mapper.EmpSelectMapper;

public class TestEmpDept {

	@Test
	public void testSelect() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		//SqlSession sqlSession = sqlSessionFactory.openSession();//需要手动处理事务
		SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动处理事务
		EmpDeptMapper mapper = sqlSession.getMapper(EmpDeptMapper.class);
		/*List<Emp> emp = mapper.getAllEmp();
		System.out.println(emp);*/
		/*Emp emp = mapper.getEmpStep("3");
		System.out.println(emp.getEname());
		System.out.println("=======================");
		System.out.println(emp.getDept());*/
		/*Dept dept = mapper.getDeptEmpsByDid("2");
		System.out.println(dept);*/
		Dept dept = mapper.getOnlyDeptByDid("1");
		System.out.println(dept.getDname());
		System.out.println("=======================");
//		System.out.println(dept.getEmps());
	}
	
}
