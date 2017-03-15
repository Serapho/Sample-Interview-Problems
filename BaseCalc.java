/*
 * By Eduardo Murillo
 * This program takes a base 10 number and asks the user to what base it should convert it.
 * Then returns the converted value.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BaseCalc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, base;
		char continuar = 'y';
		while(continuar=='y'){
			System.out.print("Give me a number in base 10: ");
			num = in.nextInt();
			
			System.out.print("Give me a base(up to 16): ");
			base = in.nextInt();
			
			convertToBase(num, base);
			
			//140 to b 8 should be 214
			System.out.print("\nContinue? (y/n)");
			continuar = in.next().charAt(0);
		}
	}
	
	public static void convertToBase(int number, int base){
		//vars
		Stack<Integer> numStack = new Stack<Integer>();
		
		//divide number over and over until num is > base. while doing so remainders get put on the queue.
		while(number >= base){
			numStack.push(number % base);
			number = number/base;
		}
		numStack.push(number);
		
		//System.out.println(numStack);
		
		for(int i = 0; i<=numStack.size()+1; i++){
			if(base > 10){
				int temp = numStack.pop();
				switch (temp){
					case 10: System.out.print('A');
								break;
					case 11: System.out.print('B');
								break;
					case 12: System.out.print('C');
								break;
					case 13: System.out.print('D');
								break;
					case 14: System.out.print('E');
								break;
					case 15: System.out.print('F');
								break;
					default: System.out.print(temp);
								break;
				}				
			}else{
				System.out.print(numStack.pop());
			}
		}
	}
}
