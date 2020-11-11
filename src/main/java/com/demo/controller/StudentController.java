package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.domian.Student;
import com.demo.inputdetail.CommonInputDetail;
import com.demo.outputdetail.CommonOutDetail;
import com.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	public static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.POST)
	@ResponseBody
	public String hello() {
		logger.info("世界，你好！");
		return "hello!";
		
	}
	
	
	@RequestMapping(value = "/queryStudentById", method = RequestMethod.POST)
	public CommonOutDetail queryStudentById(@RequestBody CommonInputDetail input) {
		
		CommonOutDetail commonOutDetail = null;
		try {
			logger.info("开始查询学生信息，queryStudentById");
			int id = Integer.parseInt(input.getId());
//			Student student = studentService.selectStudentById(id);
			Student student = studentService.queryStudentById(id);
			commonOutDetail = new CommonOutDetail();
			
			List<Object> lists = new ArrayList<>();
			lists.add(student);
			commonOutDetail.setList(lists);
			
			commonOutDetail.setReturnCode("000000");
			commonOutDetail.setReturnMsg("成功");
			logger.info("查询学生信息结束！");
			return commonOutDetail;
		} catch (Exception e) {
			
		}
		
		return commonOutDetail;
		
	}
	
	@RequestMapping(value = "/queryStudentOne", method = RequestMethod.POST)
	public CommonOutDetail queryStudentOne(@RequestBody CommonInputDetail input) {
		
		CommonOutDetail commonOutDetail = null;
		try {
			logger.info("开始查询学生信息，queryStudentOne");
			int id = Integer.parseInt(input.getId());
			
			Student student = new Student();
			student.setId(id);
			
			Student student1 = studentService.queryStudentOne(student);
			commonOutDetail = new CommonOutDetail();
			
			List<Object> lists = new ArrayList<>();
			lists.add(student1);
			commonOutDetail.setList(lists);
			
			commonOutDetail.setReturnCode("000000");
			commonOutDetail.setReturnMsg("成功");
			logger.info("查询学生信息结束！");
			return commonOutDetail;
		} catch (Exception e) {
			
		}
		
		return commonOutDetail;
		
	}
	
}
