package calcproj;

import java.util.Scanner;

import calcproj.operations.AddOperation;
import calcproj.operations.DivideOperation;
import calcproj.operations.MultiplyOperation;
import calcproj.operations.SubtractOperation;

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
		double resultDouble = 0.0;

		if (operation.equals("add")) {
			AddOperation add = new AddOperation();
			add.setA(firstNumber);
			add.setB(secondNumber);
			result = add.getResult();
		} else if (operation.equals("subtract")) {
			SubtractOperation subtract = new SubtractOperation();
			subtract.setA(firstNumber);
			subtract.setB(secondNumber);
			result = subtract.getResult();
		} else if (operation.equals("multiply")) {
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(firstNumber);
			multiply.setB(secondNumber);
			result = multiply.getResult();
		} else if (operation.equals("divide")) {
			DivideOperation divide = new DivideOperation();
			divide.setA(firstNumber);
			divide.setB(secondNumber);
			resultDouble = divide.getResult();
		} else {
			System.out.println("Invalid Operation");
		}

		if (operation.equals("divide")) {
			System.out.println("Result is: " + resultDouble);
		} else {
			System.out.println("Result is: " + result);
		}

	}

}
