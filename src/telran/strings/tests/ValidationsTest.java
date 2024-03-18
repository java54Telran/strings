package telran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.strings.Validations;

class ValidationsTest {

	@Test
	void testIsArithmeticExpression() {
		//TODO add more tests for "true" and "false"
		assertFalse(Validations.isArithmeticExpression("2 +() 3"));
		assertFalse(Validations.isArithmeticExpression("(20.5 + abc12))*2"));
		
	}

}
