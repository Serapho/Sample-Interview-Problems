/*
 * By Eduardo Murillo
 * This program is one of the coding questions I have ran into more often during interviews.
 * The rules are as follows:
 * For multiples of 3 print Fizz
 * for multiples of 5 print Buzz
 * for multiples of both print FizzBuzz
 * if neither then just print the number
 * 
 * I hard coded a limit of 50
 */
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 0; i<=50; i++){
			if(i%3==0 && i%5==0){
				System.out.println("FizzBuzz");
			}else if (i%5==0){
				System.out.println("Buzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}
	}
}
