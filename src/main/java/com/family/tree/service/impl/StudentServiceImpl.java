package com.family.tree.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.family.tree.dao.StudentMapper;
import com.family.tree.entity.Student;
import com.family.tree.service.IStudentService;

@Service("studentServiceImpl")
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentDao;
	
	@Override
	public boolean save(Student student) {
		return studentDao.insertSelective(student) > 0;
	}

	@Override
	public boolean delete(Long id) {
		return studentDao.deleteByPrimaryKey(id) > 0;
	}

	@Override
	public boolean update(Student student) {
		return studentDao.updateByPrimaryKey(student) > 0;
	}

	@Override
	public Student selectBySId(Long id) {
		return studentDao.selectByPrimaryKey(id);
	}

}
