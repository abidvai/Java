
class person{
	
	// Instance variables (data or "states")
	String name;
	int age;
	
	
	// classes can contain
	
	// 1. Data
	// 2. Subroutines (methods)
	
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old.");
		}
	}
	
	void sayhello() {
		System.out.println("Hello there!");
	}
	int getAge() {
		return age;
	}
}


public class Class_and_Object {
	public static void main(String[] args) {
		
		// Create a person object using the person class
		person person1 = new person();
		person1.name = "Abdullah Al Abid";
		person1.age = 21;
		person1.speak();
		person1.sayhello();
		
		// Create a second person object
		person person2 = new person();
		person2.name = "Abdullah Al Pranto";
		person2.age = 26;
		person2.speak();
		person2.sayhello();
		
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person2.name);
		System.out.println(person2.age);
		
	}
}
