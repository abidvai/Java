
class Student{
	String name;
	static String school;


	public static void changeSchool() {
		school = "newschool";
	}
}

public class Static_keyword {
	public static void main(String args[]) {
		 Student.school = "Bindubasini";
		 Student student1 = new Student();
		 student1.name = "Abid";
		 System.out.println(student1.school);
	}
}
