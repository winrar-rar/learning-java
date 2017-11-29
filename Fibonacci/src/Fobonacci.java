/**
 * Demonstrates how the Fibonacci sequence works with and without recursion.
 * 
 * @author Christian Andersson
 *
 */
public class Fobonacci {
	
	private static int n0 = 0;
	private static int m0 = 0;
	private static int n1 = 1;
	private static int m1 = 1;
	private static int n2, m2;
	
	private static int count = 10;
	
	public static void main(String[] args) {
		
		System.out.println("Iterative");
		iteration();
		
		System.out.println("\n" + "Recursive");
		recursion();
	}

	//without recursion
	private static void iteration() {
		System.out.print(n0 + " " + n1); //prints 0 and 1.
		
		for(int i = 2; i < count; i++) { //starts at 2 because 0 and 1 has been printed and it shall only be 10 numbers in total. Stops when i hits 9.  
			n2 = n0 + n1; //1st loop: 0 + 1 = 1. 2nd loop: 1 + 1 = 2. 3rd loop: 1 + 2 = 3. 
			
			System.out.print(" " + n2); //1st loop: 1. 2nd loop: 2. 3rd loop: 3.
			n0 = n1; //1st loop: 0 -> 1. 2nd loop: 1 -> 1. 3rd loop: 1 -> 2.
			n1 = n2; //1st loop: 1 -> 1. 2nd loop: 1 -> 2. 3rd loop: 2 -> 3.
		}
	}
	
	//with recursion
	private static void recursion() {
		System.out.print(m0 + " " + m1); //prints 0 and 1.
		
		doRecursive(count-2); //two numbers has already been printed and it shall only 10 numbers in total.
	}

	private static void doRecursive(int count) {
		if(count>0) { //count will not enter the if-statement if count is 0. 
			m2 = m0 + m1; //1st loop: 0 + 1 = 1. 2nd loop: 1 + 1 = 2. 3rd loop: 1 + 2 = 3. 
			
			m0 = m1; //1st loop: 0 -> 1. 2nd loop: 1 -> 1. 3rd loop: 1 -> 2.
			m1 = m2; //1st loop: 1 -> 1. 2nd loop: 1 -> 2. 3rd loop: 2 -> 3.
			
			System.out.print(" " + m2); //1st loop: 1. 2nd loop: 2
			doRecursive(count-1); //restart the loop until count hits 0.
		}
		
	}
}
