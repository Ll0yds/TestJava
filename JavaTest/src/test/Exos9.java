package test;

import java.util.Scanner;

public class Exos9 {

	private static Scanner in;

	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		
		System.out.print("Input a number: ");
		int num1 = in.nextInt();
		
		for (int i=1; i<= 10; i++) {
			System.out.println(num1 + " x " + i + " = " + (num1 * i));
		}

	}

}
