import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");

		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		double num2 = 1.0;
		boolean isNumber = true;
		
		
		
		do {
			System.out.println("Enter Length");
			if (scan.hasNextInt()) {
				num = scan.nextInt();
				isNumber = true;
			}else if(scan.hasNextDouble()){
				
				num2 = scan.nextDouble();
				isNumber = true;
				scan.next();
			}else if(num<=0 || num2<=0){
				System.out.println("Error! Invalid decimal value. Try again.");
				isNumber = false;
			}
			
			else {
				
				System.out.println("Invalid");
				isNumber = false;
			}
			 
		} while (!(isNumber));
		
		do {
			System.out.println("Enter width");
			if (scan.hasNextInt()) {
				num = scan.nextInt();
				isNumber = true;
			}else if(scan.hasNextDouble()){
				
				num2 = scan.nextDouble();
				isNumber = true;
				scan.next();
			}else if(num<=0 || num2<=0){
				System.out.println("Error! Invalid decimal value. Try again.");
				isNumber = false;
			}
			
			else {
				
				System.out.println("Invalid");
				isNumber = false;
			}
			 
		} while (!(isNumber));
		
		

	}

}
