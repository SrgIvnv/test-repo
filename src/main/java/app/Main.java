package app;

import java.util.Scanner;

import arithmetic_actions.BasicActions;

public class Main {

	public static void main(String[] args) {

		BasicActions arithmetic = new BasicActions();

		Scanner sc = new Scanner(System.in);

		System.out
				.println("Enter the first numbet then (+, -, *, /) then the second number.");
		double a = sc.nextDouble();
		String action = sc.next();
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
		default:
			System.out.println("Incorrect data entered.");
			break;
		}
	}
}