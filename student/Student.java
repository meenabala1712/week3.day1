package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Name of the student");
	}

	public void studentDept() {
		System.out.println("Department of the student");
	}

	public void studentId() {
		System.out.println("Id of the student");
	}

	public static void main(String[] args) {
	Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentId();
		student.studentDept();
	}
}
