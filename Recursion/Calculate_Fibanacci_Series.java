package Recursion;

public class Calculate_Fibanacci_Series {
	public static void printFiv(int a, int b, int n) {
		if(n == 0) {
			return;
		}
		int ans = a + b;
		System.out.println(ans);
		printFiv(b,ans,n-1);
	}
	public static void main(String[] args) {
		int a = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);
		
		int n = 7;
		printFiv(a,b,n-2);
	}
}
