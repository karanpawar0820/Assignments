package com.cts.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentService implements InitializingBean,DisposableBean {
	
private List<Student> students=new ArrayList<>();

public void addStudent(Student student) {
	students.add(student);
}

public List<Student> getAllStudents()
{
	return new ArrayList<>(students);
}

public Student getStudentById(Long id)
{
	for(Student student:students)
	{
		if(student.getId().equals(id))
		{
			return student;
		}
	}
	return null;
}

public void updateScore(Long id,int newScore)
{
	for(Student student:students)
	{
		if(student.getId().equals(id))
		{
			int oldScore=student.getScore();
			student.setScore(newScore);
			scoreSystem(student, oldScore, newScore);
			break;
		}
	}
}

public void deleteStudent(Long id)
{
	Student studentToRemove=null;
	for(Student student:students)
	{
		if(student.getId().equals(id))
		{
			studentToRemove= student;
			break;
		}
	}
	if(studentToRemove!=null)
	{
		students.remove(studentToRemove);
	}
}

private void scoreSystem(Student student, int oldScore, int newScore) {
	String message;
	
	if(newScore<50) {
		message="Below Average";
	}
	else if(newScore>=50 && newScore<=75)
	{
		message="Average";
	}
	else
	{
		message="Above Average";
	}
	System.out.println("Score updated for student "+ student.getName()+" ID:"+ student.getId()+" Old Score="+oldScore+", New Score="+newScore+ " Student is " + message);
}

public void afterPropertiesSet() throws Exception{
	System.out.println("StudentService has been initialized.");
}

public void destroy() throws Exception{
	System.out.println("StudentService is being destroyed.");
}


}
