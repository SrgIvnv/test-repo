package app;

import java.util.Scanner;

import arithmetic_actions.BasicActions;

public class Main {

	private static final Scanner sc = new Scanner(System.in);

	private static final String MENU = "Enter the first number then choose action ('+', '-', '*', '/', 'pow', 'max') then the second number.";
	private static final String ERROR = "ERR";

	public static void main(String[] args) {

		BasicActions arithmetic = new BasicActions();

		while (true) {
			System.out.println(MENU);
			double a = sc.nextDouble();
			String action = sc.next().toLowerCase();
			double b = sc.nextDouble();
			switch (action) {
			case "+":
				System.out.println(arithmetic.add(a, b));
				break;
			case "-":
				System.out.println(arithmetic.subtract(a, b));
				break;
			case "*":
				System.out.println(arithmetic.multiply(a, b));
				break;
			case "/":
				System.out.println(arithmetic.divide(a, b));
				break;
			case "pow":
				System.out.println(arithmetic.pow(a, b));
				break;
			case "max":
				System.out.println(arithmetic.max(a, b));
				break;
			default:
				sc.close();
				System.out.println(ERROR);
				break;
			}
		}
	}
}