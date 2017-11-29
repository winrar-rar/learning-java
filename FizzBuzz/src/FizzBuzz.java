
/**
 * Java version of the game FizzBuzz. 
 *
 * @author Christian Andersson
 *
 */
public class FizzBuzz {
	public static void main(String[] args) {
		String fizz = "Fizz";
		String buzz = "Buzz";
		String str = "";
		
		for(int i = 1; i <= 100; i++) {
			str = ""; //makes str empty for each loop.
						
			if(i % 3 == 0) { //if i can be divided by 3 then Fizz shall be printed
				str += fizz; //adds Fizz to the String.
			}
			if(i % 5 == 0) { //if i can be divided by 5 then Buzz shall be printed
				str += buzz; //adds Buzz to the String.
			}
			if(str == "") { //if the String is empty then i cannot be divided by 3 nor 5.
				str += i; //adds i to the String.
			}
			
			System.out.println(str); //print the String. 
			
		}
	}
}
