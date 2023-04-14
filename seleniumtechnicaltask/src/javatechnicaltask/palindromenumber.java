package javatechnicaltask;

import java.util.Scanner;

public class palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int original = a;
		int temp = 0;
		int rev = 0;
	
		while(a>0) {
			rev = a%10;
			temp = (temp*10)+ rev;
			a =a/10;
		}
		if(original ==temp) {
			System.out.println("it is a palindrome number");
		}else {
			System.out.println("it is not a palindrome number");
		}

	}
	

}
