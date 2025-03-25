package Lab_2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CaculatorTest {
	Caculator cal = new Caculator();
		
		@Test
		public void testAssertEquals() {
			int expected_result = 6;
			int actual_result = cal.add(4, 2);
			assertEquals(expected_result, actual_result);
		}
		
		@Test
		public void testAssertNotEquals() {
			int expected_result = 6;
			int actual_result = cal.subtract(4, 2);
			assertNotEquals(expected_result, actual_result);
		}
		
		@Test
		public void testAssertTrue() {
			int expected_result = 10;
			int actual_result = cal.multiply(2, 5);
			assertTrue(expected_result == actual_result);
		}
		
		@Test
		public void testAssertFalse() {
			int expected_result = 3;
			int actual_result = cal.divide(7, 4);
			assertFalse(expected_result == actual_result);
		}
		
		
		@Disabled
		@Test
		public void testthrowExpection() {
			int expected_result = 3;
			
			assertThrows(ArithmeticException.class, ()->{
				cal.divide(3, 1);
			},"Must throw ArithmeticException");
		}
		
		@Test
		public void testAssertNull() {
			Integer actual_result  = null;
			assertNull(actual_result);
		}
	}

