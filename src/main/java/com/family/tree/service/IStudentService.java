package com.family.tree.service;

import com.family.tree.entity.Student;

public interface IStudentService {

	public boolean save(Student student);
	
	public boolean delete(Long id);

	public boolean update(Student student);

	public Student selectBySId(Long id);
}
