package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	@Test
	void test_input_is_3_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(3);
		assertEquals("Fizz", input);
	}

}
