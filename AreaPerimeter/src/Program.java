import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner sc = new Scanner(System.in);
		 
		// Display Welcome Message
		System.out.println("Welcome to the Area and Perimeter Calculator");
		 
		// Declare loop control variable
		String continueLoop;
		 
		// Create Control Loop
		do{
		// Create a blank line
		System.out.println();
		 
		// Prompt for length
		System.out.print("Enter length: ");
		 
		// Declare and set value for length variable
		double length = sc.nextDouble();
//		if (!sc.hasNextDouble()) {
//			System.out.println("Error! invalid decimal value. Try Again");
//		} else if (length <= 0) {
//			System.out.println("Error! Number must be greater than 0.0");
//		} else if (length > 1000000) {
//
//			System.out.println("Error! number must be less than 1000000.0");
//		} else {
//			System.out.println("Invalid input");
//		}
//		 
		// Prompt for width
		System.out.print("Enter width: ");
		 
		// Declare and set value for length variable
		double width = sc.nextDouble();
//		if (!sc.hasNextDouble()) {
//			System.out.println("Error! invalid decimal value. Try Again");
//		} else if (width <= 0) {
//			System.out.println("Error! Number must be greater than 0.0");
//		} else if (width > 1000000) {
//
//			System.out.println("Error! number must be less than 1000000.0");
//		} else {
//			System.out.println("Invalid input");
//		}
		 
		// Declare and calculate area using length and width
		double area = length * width;
		 
		// Declare and calculate perimeter using length and width
		double perimeter = (2 * width) + (2 * length);
		 
		// Display area and perimeter to user
		System.out.print("Area: " + area);
		System.out.println();
		System.out.println("Perimeter " + perimeter);
		 
		// Create a blank line
		System.out.println();
		 
		// Prompt for continue
		System.out.print("Continue? (y/n): ");
		 
		// Set value for loop control variable
		continueLoop = sc.next();
		 
		}
		// Continuation clause
		while(continueLoop.equalsIgnoreCase("Y"));

	}

}
