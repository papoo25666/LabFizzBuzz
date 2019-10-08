package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClassFizzBuzz {

	@Test
	void test_input_is_1_expect_output_is_1() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(1);
		assertEquals("1", input);
	}
	@Test
	void test_input_is_2_expect_output_is_2() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(2);
		assertEquals("2", input);
	}
	@Test
	void test_input_is_3_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(3);
		assertEquals("Fizz", input);
	}
	@Test
	void test_input_is_4_expect_output_is_4() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(4);
		assertEquals("4", input);
	}
	@Test
	void test_input_is_5_expect_output_is_Buzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(5);
		assertEquals("Buzz", input);
	}
	@Test
	void test_input_is_6_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(6);
		assertEquals("Fizz", input);
	}
	@Test
	void test_input_is_7_expect_output_is_7() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(7);
		assertEquals("7", input);
	}
	@Test
	void test_input_is_8_expect_output_is_8() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(8);
		assertEquals("8", input);
	}
	@Test
	void test_input_is_9_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(9);
		assertEquals("Fizz", input);
	}
	@Test
	void test_input_is_10_expect_output_is_Buzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(10);
		assertEquals("Buzz", input);
	}
	@Test
	void test_input_is_11_expect_output_is_11() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(11);
		assertEquals("11", input);
	}
	@Test
	void test_input_is_12_expect_output_is_Fizz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(12);
		assertEquals("Fizz", input);
	}
	@Test
	void test_input_is_13_expect_output_is_13() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(13);
		assertEquals("13", input);
	}
	@Test
	void test_input_is_14_expect_output_is_14() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(14);
		assertEquals("14", input);
	}
	@Test
	void test_input_is_15_expect_output_is_FizzBuzz() {
		FizzBuzz fizzbuzz = new FizzBuzz();
		String input = fizzbuzz.printStringinput(3);
		assertEquals("Fizz", input);
	}

}
