package com.matrix.day03_mbg.com.matrix.test;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.matrix.day03_mbg.com.matrix.bean.Emp;
import com.matrix.day03_mbg.com.matrix.bean.EmpExample;
import com.matrix.day03_mbg.com.matrix.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
//import org.mybatis.generator.api.MyBatisGenerator;
//import org.mybatis.generator.config.Configuration;
//import org.mybatis.generator.config.xml.ConfigurationParser;
//import org.mybatis.generator.internal.DefaultShellCallback;


public class TestSQL {

	
	@Test
	public void testCRUD() throws Exception {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
		EmpExample example = new EmpExample();
		
		EmpExample.Criteria c1 = example.createCriteria();
		c1.andEnameLike("%a%");
		c1.andSexEqualTo("1");
		
		EmpExample.Criteria c2 = example.createCriteria();
		c2.andDidEqualTo(2);
		
		example.or(c2);
		
		List<Emp> list = mapper.selectByExample(example);
		for (Emp emp : list) {
			System.out.println(emp);
		}
		
	}
	
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		return sqlSessionFactory;
	}
	
//	@Test
//	public void testMBG() throws Exception {
//	   List<String> warnings = new ArrayList<String>();
//	   boolean overwrite = true;
//	   File configFile = new File("mbg.xml");
//	   ConfigurationParser cp = new ConfigurationParser(warnings);
//	   Configuration config = cp.parseConfiguration(configFile);
//	   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
//	   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
//	   myBatisGenerator.generate(null);
//	}
	
}
