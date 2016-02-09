

//Class name
public class SpaceNeedle1 {

	// Declare and initialize a class constant.
	public static final int SIZE = 5;

	// main method
	public static void main(String[] args) {

		thinMast_Antenna();
		domeUpperHalf();
		domeJoint();
		domeLowerHalf();
		thinMast_Antenna();
		midSection();
		domeUpperHalf();
		domeJoint();
	}

	// static method for the rod-like thin mast and antenna of SpaceNeedle.
	public static void thinMast_Antenna() {
		for (int lineAntenna = 1; lineAntenna <= SIZE; lineAntenna++) {
			for (int antPosition = 1; antPosition <= (3 * SIZE); antPosition++) {
				System.out.print(" ");
			}

			System.out.print("||\n");
		}

	}

	// static method for the upper-half of the dome and base.
	public static void domeUpperHalf() {
		for (int lineDome = 1; lineDome <= SIZE; lineDome++) {
			for (int domePosition = (3 * SIZE); (domePosition - (3 * lineDome)) >= 1; domePosition--) {
				System.out.print(" ");

			}
			System.out.print("__/");
			for (int colonPaint = 1; colonPaint <= (lineDome - 1); colonPaint++) {
				System.out.print(":::");

			}
			System.out.print("||");
			for (int colonPaint = 1; colonPaint <= (lineDome - 1); colonPaint++) {
				System.out.print(":::");
			}

			System.out.print("\\__\n");
		}
	}

	// static method for the mid-part of the dome.
	public static void domeJoint() {
		System.out.print("|");
		for (int joint = 1; joint <= (6 * SIZE); joint++) {
			System.out.print("\"");
		}

		System.out.print("|\n");

	}

	// static method for the lower part of dome.
	public static void domeLowerHalf() {
		for (int lineDome = 1; lineDome <= SIZE; lineDome++) {
			for (int domePosition = 1; domePosition <= (2 * (lineDome - 1)); domePosition++) {
				System.out.print(" ");
			}

			System.out.print("\\_");

			for (int paintSlashes = 3 * SIZE; (paintSlashes - 2 * lineDome + 1) > 0; paintSlashes--) {
				System.out.print("/\\");
			}

			System.out.print("_/\n");
		}
	}

	// static method for the thick mast(mid-section of SpaceNeedle)
	public static void midSection() {
		for (int lineMidSec = 1; lineMidSec <= (SIZE * SIZE); lineMidSec++) {
			for (int midSecPosition = 1; midSecPosition <= (2 * SIZE + 1); midSecPosition++) {
				System.out.print(" ");
			}

			System.out.print("|");
			for (int midSecDecorate = 1; midSecDecorate <= (SIZE - 2); midSecDecorate++) {
				System.out.print("%");
			}
			System.out.print("||");

			for (int midSecDecorate = 1; midSecDecorate <= (SIZE - 2); midSecDecorate++) {
				System.out.print("%");
			}

			System.out.print("|\n");

		}

	}

}
