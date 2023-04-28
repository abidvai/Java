package Recursion;

public class Calculate_Power {
	/*
	public static int calPower(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		}
		int powm1 = calPower(x, n-1);
		int power = x * powm1;
		return power;
	}
	public static void main(String[] args) {
		int x = 2, n = 5;
		int ans = calPower(x,n);
		System.out.println(ans);
	}
	*/
	
	//Using log(n) technique for this problem
	
	public static int printPower(int x, int n) {
		if(x == 0) {
			return 0;
		}
		if(n == 0) {
			return 1;
		}
		
	
		if(n %2 == 0) { //even
			return printPower(x, n/2) * printPower(x, n/2);
		}else { // odd
			return printPower(x, n/2) * printPower(x, n/2) * x;
		}
	}
	public static void main(String[] args) {
		int x = 2, n = 5;
		int ans = printPower(x,n);
		System.out.println(ans);
	}
}
