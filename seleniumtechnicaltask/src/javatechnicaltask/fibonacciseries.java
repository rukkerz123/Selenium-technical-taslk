package javatechnicaltask;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num1 = 0;
		int num2 = 1;
		int nextnum;
		int lengthoftheseries;
		System.out.println("enter the length of the series");
		Scanner sc = new Scanner(System.in);
	   lengthoftheseries = sc.nextInt();
	   for(int i= 0;i<lengthoftheseries;i++) {
		   System.out.print(num1 + "  ");
		   nextnum = num1+num2;
		   num1 = num2;
		   num2 = nextnum;
	   }
		

	}

}
