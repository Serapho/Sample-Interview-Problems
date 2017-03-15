/*
 * By Eduardo Murillo
 * This program takes user input and outputs all prime numbers up to the given limit
 */

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		int limit;
		int num1 = 0;
		int num2 = 1;
		int temp;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Fibonacci upper limit: ");
		limit = in.nextInt();
		
		while(num1 <= limit){
			System.out.println(num1);
			temp = num1;
			num1 = num2;
			num2 = temp + num2;
		}
		
	}

}
