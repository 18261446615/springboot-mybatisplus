package com.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.demo.domian.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student>{

	@Select("select id as id, name as name, sex as sex, age as age, height_stature as heightStature "
			+ "from student where id = #{id}")
	Student selectStudentById(int id);
	
}
