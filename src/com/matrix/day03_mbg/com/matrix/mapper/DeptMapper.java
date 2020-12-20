package com.matrix.day03_mbg.com.matrix.mapper;

import java.util.List;

import com.matrix.day03_mbg.com.matrix.bean.Dept;
import com.matrix.day03_mbg.com.matrix.bean.DeptExample;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int countByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int deleteByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int deleteByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int insert(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int insertSelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    List<Dept> selectByExample(DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    Dept selectByPrimaryKey(Integer did);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int updateByPrimaryKeySelective(Dept record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dept
     *
     * @mbggenerated Mon Jun 24 16:25:19 CST 2019
     */
    int updateByPrimaryKey(Dept record);
}