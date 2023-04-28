package Recursion;

public class Calculate_Factorial {
	public static int calFactorial(int n) {
		if(n == 0 || n== 1) {
			return 1;
		}
		int factorail_1 = calFactorial(n-1);
		int factorial_n = n * factorail_1;
		return factorial_n;
	}
	
		
	public static void main(String[] args) {
		int n= 4;
		int ans = calFactorial(n);
		
		System.out.println(ans);
	}
}
