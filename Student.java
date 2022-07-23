package week3.day1.org.student;

import week3.day1.org.college.College;
import week3.day1.org.department.Department;


	public class Student {
		public static void studentName() {
			System.out.println("Student Name: xyz");
		}
		public static void studentDept() {
			System.out.println("Student Dept: IT");
		}
		public static void studentId() {
			System.out.println("Student ID: 036");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			College clg= new College();
			clg.collegeName();
			clg.collegeCode();
			clg.collegeRank();
			
			Department dept=new Department();
			dept.deptName();
			
			studentName();
			studentDept();
			studentId();
			
			
		}
}
