/*
 * By Eduardo Murillo
 * This program takes user input and outputs all prime factors for the given input
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPrimeFactors {

	public static void main(String[] args) {
		System.out.print("Enter a number to find the prime factors of: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
				
		List<Integer> factors = new ArrayList<Integer>(); 

		if(num <=2){
			System.out.println("Prime factors = "+num);
			System.exit(0);
		}
		
		
		//loop from 2 to n
		for(int i =2; i<= num; i++){
			//if isPrime try to see if it is a factor
			if(isPrime(i)){
				//while i is a factor (n%i==0) keep dividing and storing i
				while(num%i==0){
					num = num/i;
					factors.add(i);
				}
			}//else i++
			
			//output i. did this to make sure it was working while it tested big numbers
			//System.out.println(i);
		}
		
		//once we have all out factors lets output them
		System.out.println("Outputting factors: ");
		for(int j = factors.size(); j > 0; j--){
			System.out.print(factors.get(j-1)+" ");
		}
	}

	private static boolean isPrime(int x) {
		if(x <=2){
			return true;
		}
		for(int i = 2; i<x; i++){
			if(x%i==0){
				return false;
			}
		}
		return true;
	}

}
