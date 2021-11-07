package abcTraining;

import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
		/*
		 * System.out.println("Enter the number to find factors of it: "); Scanner sc =
		 * new Scanner(System.in); int n = sc.nextInt(); int sum = 0; for(int
		 * i=1;i<=n;i++) { if(n%i==0) { sum = sum + i; System.out.println(i);
		 * 
		 * } } System.out.println("Sum of factors of "+n+" is "+sum);
		 */
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the number ");
		 * int n = sc.nextInt(); int sum=1; System.out.print(n+"! = "); for(int
		 * i=n;i>=1;i--){ sum=sum*i; if(i==1) { System.out.print(i+" = "); } else {
		 * System.out.print(i+" x "); } } System.out.print(sum);
		 */
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range: ");
		 int n = sc.nextInt();
		 System.out.println("Enter the ending range: ");
		 int o = sc.nextInt();
		 int count=0;
		 for(int i=n;i<o-1;i++) {
			 if(primeOrNot(i) && primeOrNot(i+2)) {
				 System.out.println("("+i+", "+(i+2)+")");
				 count++;
			 }
		 }
		 if(count==0){
			 System.out.println("No Twin Prime Found!! ");
		 }

	}
	static boolean primeOrNot(int a) {
		int count=0;
		for(int j=2;j<=a/2;j++) {
			 if(a%j==0) {
				 count++;
			 }
		 }
		if(a==1) {
			return false;
		}
		else if(count==0) {
			return true;
		}
		return false;
		
	}

}
