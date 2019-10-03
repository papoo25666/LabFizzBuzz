package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	@Test
	void test_input_expect_output_is_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		int input = fizzbuzz.printStringinput(1);
		assertEquals(1, input);
	}

}
