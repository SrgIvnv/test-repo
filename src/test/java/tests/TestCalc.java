package tests;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import arithmetic_actions.BasicActions;

public class TestCalc {

	private static BasicActions arithmetic;

	@BeforeClass
	public static void runT() {
		arithmetic = new BasicActions();
	}

	@Test
	public void testAdd() {
		double result = arithmetic.add(9, 3);
		Assert.assertTrue(result == 12);
	}

	@Ignore
	@Test
	public void testSubtract() {
		double result = arithmetic.subtract(9, 3);
		Assert.assertFalse(result != 6);
	}

	@Test
	public void testMultiply() {
		double result = arithmetic.multiply(9, 3);
		Assert.assertEquals(27, result, 0);
	}

	@Test
	public void testDivision() {
		double result = arithmetic.divide(9, 3);
		if (result != 3)
			Assert.fail();
	}

	@Test
	public void testObject() {
		Assert.assertNotNull(arithmetic);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivException() {
		arithmetic.divide(9, 0);
	}

	@Test(timeout = 1000)
	public void testTime() {
		System.out.println("Hello!");
	}
}
