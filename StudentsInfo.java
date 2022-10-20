package week3.day1;

public class StudentsInfo {
	
	public void getStudentInfo(int id) {
		System.out.println("Student ID is " +id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID and Name is " +id+" "+name );
	}
	public void getStudentInfo(String email, String phno) {
		System.out.println("Student Email and Phone Number is " +email+" "+phno);
	}

	public static void main(String[] args) {
		StudentsInfo std = new StudentsInfo();
		std.getStudentInfo(25);
		std.getStudentInfo(25, "Tamil");
		std.getStudentInfo("stamil.gmail.com,", "9842795152");
	}
}

