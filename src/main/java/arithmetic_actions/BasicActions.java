package arithmetic_actions;

public class BasicActions {

	public double add(double a, double b) {
		return a + b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		if (b == 0)
			throw new ArithmeticException();
		return a / b;
	}

	public double pow(double a, double b) {
		return Math.pow(a, b);
	}

	public double max(double a, double b) {
		return Math.max(a, b);
	}

	public double min(double a, double b) {
		return Math.min(a, b);
	}
}