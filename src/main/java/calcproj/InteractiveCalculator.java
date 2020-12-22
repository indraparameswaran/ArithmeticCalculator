package calcproj;

import java.util.Scanner;

public class InteractiveCalculator {

	public static final void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me the first number: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Give me the second number: ");
		int secondNumber = scanner.nextInt();

		System.out.println("Give me a operation: ");
		scanner.nextLine();
		String operation = scanner.nextLine();

		int result = 0;

		if (operation.equals("add")) {

		} else if (operation.equals("subtract")) {

		} else if (operation.equals("multiply")) {

		} else if (operation.equals("divide")) {

		} else {
			System.out.println("Invalid Operation");
		}

		System.out.println("Result is: " + result);

	}

}
