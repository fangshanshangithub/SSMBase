package com.family.tree.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.family.tree.entity.Student;
import com.family.tree.service.IStudentService;


@Controller
@RequestMapping("/student")
public class StudentController {
	private static Logger logger =  LoggerFactory.getLogger(StudentController.class);
	
	@Resource
	private IStudentService studentService;
	
	@RequestMapping("/showUser{id}")
	public String toIndex(@PathVariable("id") String id,HttpServletRequest request,Model model){
		logger.info("*********StudentController 开始执行了！！！！******");
		Long sId = Long.parseLong(id);
		Student student = studentService.selectBySId(sId);
		model.addAttribute("student", student);
		logger.info("*********StudentController 结束了！！！！******");
		return "showUser";
	}
}
