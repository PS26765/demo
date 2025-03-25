package Lab_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

	@Test
	public void testApp() {
		assertTrue(true);
	}
	
	
	@Test
	public void testIsEvenNumber2() {
		App demo1 = new App();
		boolean result = demo1.isEvenNumber(2);
		assertTrue(result);
	}
	
	@Test
	public void testIsEvenNumber4() {
		App demo1 = new App();
		boolean result = demo1.isEvenNumber(3);
		assertTrue(result);
	}
}
