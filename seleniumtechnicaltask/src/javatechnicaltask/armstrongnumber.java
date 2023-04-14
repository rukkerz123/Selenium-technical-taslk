package javatechnicaltask;

import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int original = b;
		int temp = 0;
		int check = 0;
		while(b>0) {
			b = b%10;
			temp = temp+(b*b*b);
			b= b/10;
		}
		if(original == temp) {
			System.out.println("it is a armstrong number");
		}else {
			System.out.println("it is not a armstrong number");
		}

	}

}
