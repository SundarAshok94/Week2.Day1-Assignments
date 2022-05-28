package org.student;

import org.Dept.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("sundar");
	}
	public void studentID() {
		System.out.println(11885);
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	
	public static void main(String[] args) {
		
		Student s=new Student();
		s.studentName();
		s.studentID();
		s.studentDept();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		
	}

}
