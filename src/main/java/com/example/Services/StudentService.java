package com.example.Services;

import java.util.List;

import com.example.Pojos.Student;

public interface StudentService {
	
	    
	    List<Student> getAllStudents();
	    
	    Student createStudent(Student student);
	    
	    Student updateStudent(Long id, Student student);
	    
	    void deleteStudent(Long id);
	    
	    Student getStudentById(Long id);
	

}
