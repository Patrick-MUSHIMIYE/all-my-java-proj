package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// create class name called CalculatorTest
// create class object using class name of the main codes that is going to be tested
//using assertEquals for test(), test1(), test2(), test3() method to test the computation
class CalculatorTest {

	@Test
	void test() {
		Calculator compute = new Calculator();
		// using assertEquals method to test the computation
		assertEquals(4.0, compute.add_sign_Btn(2, 2, 0));
	}
	@Test
	void test1() {
		Calculator compute = new Calculator();
		assertEquals(0.0, compute.sub_sign_Btn(2, 2, 0));
}
	@Test
	void test2() {
		Calculator compute = new Calculator();
		assertEquals(4.0, compute.mul_sign_Btn(2, 2, 0));
}
	@Test
	void test3() {
		Calculator compute = new Calculator();
		assertEquals(1.0, compute.div_sign_Btn(2, 2, 0));
	}
}
