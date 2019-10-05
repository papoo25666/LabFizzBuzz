package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	@Test
	void test_input_is_5_expect_output_is_Buzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(5);
		assertEquals("Buzz", input);
	}

}
