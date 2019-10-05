package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	@Test
	void test_input_is_14_expect_output_is_14() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(14);
		assertEquals("14", input);
	}

}
