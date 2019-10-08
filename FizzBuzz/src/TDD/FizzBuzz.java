package TDD;

public class FizzBuzz {

	public String printStringinput(int number) {
		String result = Integer.toString(number);
		
		if(number%15 == 0) {
			result ="FizzBuzz";
		}else if(number%3 == 0) {
			result = "Fizz";
		}else if(number%5 == 0){
			result = "Buzz";
		}
		return result;
	}
}

