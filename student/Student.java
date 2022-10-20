package org.student;

import org.college.College;

public class Student extends College{
	public void stdentName() {
		System.out.println("TAMILENIYAN SHANMUGAM");
	}
	public void stdentDept() {
		System.out.println("COMPUTER SCIENCE");
	}
	public void stdentId() {
		System.out.println("101");
	}
	public static void main(String[] args) {
		
		Student std = new Student();
		std.stdentName();
		std.stdentDept();
		std.stdentId();
		std.deptName();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		
	}

}
