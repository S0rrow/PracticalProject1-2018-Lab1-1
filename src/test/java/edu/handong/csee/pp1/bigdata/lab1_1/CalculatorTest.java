package edu.handong.csee.pp1.bigdata.lab1_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testMain() {
		String[] args = {"2", "3"};
		Calculator.main(args);
		// assertEquals compares the result of an method call with the expected result.
		assertEquals(Calculator.getCount(),5);
	}
	
	@Test
	public void testSum() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.sum(2, 3),5);
	}
	
	@Test
	public void testSub() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.subtract(2, 3),-1);
	}
	
	@Test
	public void testMod() {
		// TODO Complete this test case
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.mod(10, 4), 2);
	}

	@Test
	public void testMultiply() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.multiply(2, 3), 6);
		// TODO Complete this test case
	}
	
	@Test
	public void testDivide() {
		Calculator myCalc = new Calculator();
		assertEquals(myCalc.divide(1, 1),1, 0.00000001);
		assertEquals(myCalc.divide(2, 0),Double.NaN, 0.00000001);
	}
}
