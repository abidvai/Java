import java.util.*;

public class Practice{
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int Numbers[] = new int[size];

		//input
		for(int i = 0; i < size; i++) {
			  Numbers[i] = sc.nextInt();
		}

		// output 
		for(int i = 0; i < size; i++) {
			  System.out.println(Numbers[i]);
		}
		
	} 
}


// Question is: consrtuct a array that size will be taken from user and there will be a option that is Search numbers???


/*
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of this Array:");
int size = sc.nextInt();
int numbers[] = new int[size];

// input: 
System.out.println("Enter the value of this Array:");
for(int i = 0; i < size; i++) {
	numbers[i] = sc.nextInt();
}

System.out.println("Enter the value you want to Search: ");
int x = sc.nextInt();

// output:
for(int i = 0; i < numbers.length; i++) {
	if(numbers[i] == x) {
		System.out.println("x found at index " + i);
		}
}
*/
