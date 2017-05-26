package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCalculator {

	@Test
	public void test() {
		calculator calc = new calculator();
		assertEquals(calc.addition(10, 10), 20);
	}

}
