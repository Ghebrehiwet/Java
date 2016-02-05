import java.awt.Rectangle;
import java.util.Scanner;

public class Program2 {
	private double length;

	private double width;

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Program2 r = new Program2();

		System.out.print("Enter a length >>> ");
		r.setLength(userInput.nextDouble());

		System.out.print("Enter a width >>> ");
		r.setWidth(userInput.nextDouble());

		System.out.println("The Rectangle with the following attributes: \n"
				+ r);
		System.out.println("Has perimeter is:  " + r.perimeter()
				+ " and area is:  " + r.area());

	}

	public Program2() {
		this.length = 1.0;
		this.width = 1.0;
	}

	public double getLength() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setLength(double length) {
		if ((length >= 1.0) && (length <= 10.0))
			this.length = length;
	}

	public void setWidth(double width) {
		if ((width >= 1.0) && (width <= 10.0))
			this.width = width;
	}

	public double perimeter() {
		return 2 * (this.length + this.width);
	}

	public double area() {
		return this.getLength() * this.getWidth();
	}

	public String toString() {
		return "Length: " + this.length + "\tWidth: " + this.width;
	}

}
