package Lab_2;

public class Caculator {
	
	public int add(int a, int b) {
		
		return a + b;
	}
	
	public int subtract(int a, int b) {
			
			return a - b;
	}

	public int multiply(int a, int b) {
		
		return a * b;
	}


	public int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Can't not divide by 0"); 
		}
		return a / b;
		}
	}

