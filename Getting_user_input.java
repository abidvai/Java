import java.util.Scanner;

public class Getting_user_input {
	public static void main(String[] args) {
		
		///create scanner object
		Scanner input = new Scanner(System.in);
		
		//output the prompt
		System.out.println("Enter a line of text: ");
		
		//wait for the user to enter a line of text
		String line = input.nextLine();
		
		//tell them they entered
		System.out.println("You entered: " + line);
		

		//create scanner object
		Scanner input1 = new Scanner(System.in);
				
		//output the prompt
		System.out.println("Enter a integer: ");
				
		//wait for the user to enter a line of text
		int value = input1.nextInt();
				
		//tell them they entered
		System.out.println("You entered: " + value);
		
	}
}
