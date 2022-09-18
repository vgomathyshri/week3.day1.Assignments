package week3.day1.assignments;

public class Student extends Department {

	public String studentName()
	{
		return "Gomathy Shri";
	}
	
	public void studentDept()
	{
		System.out.println("Student Department is Mathemetics");
	}
	
	public void studentid() {
		System.out.println("Student id is 678");		
	}
	
	public int getStudentInfo(int id)
	{
		System.out.println("student id alone - overloaded" + id);
		return 123;
	}
		
	public void getStudentInfo(int id, String name) {
		
		System.out.println("Student id and name - overloaded" + id + name);
		
	}
	
	public void getStudentInfo(String email, long phonenumber)
	{
		System.out.println("Studend email and phone number - overloaded" + email + phonenumber);
	}
	
	public static void main(String[] args) {
		
		Student stuobj = new Student();
		//College details
		System.out.println(stuobj.collegeName());
		System.out.println(stuobj.collegeCode());
		stuobj.collegeRank();
		
		//Department details
		stuobj.deptName();
		
		//Student details
		System.out.println(stuobj.studentName());
		stuobj.studentDept();
		stuobj.studentid();
		
	
		//Overloaded methods
		stuobj.getStudentInfo(678);
		stuobj.getStudentInfo(234, "Rishabh");
		stuobj.getStudentInfo("abc@abc.com", 8765432123l);
		
	
	
	
	}
	
	
	
	
}
