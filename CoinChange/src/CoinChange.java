import java.util.Scanner;

public class CoinChange {

	public static void main(String[] args) {
		System.out.println("Welcome to Money Coin ");
		System.out.println("Enter a numbre");
		Scanner sc = new Scanner(System.in);

		int amount = sc.nextInt();
		String choice = sc.nextLine();

		do {
			do {
				int quarterAmount = amount / 25;
				if (amount >= 25) {
					System.out.println("Quarters: " + quarterAmount);
					amount -= quarterAmount * 25;
				}

				int dimeAmount = amount / 10;
				if (amount >= 10) {

					System.out.println("Dime: " + dimeAmount);
					amount -= dimeAmount * 10;
				}

				int nickelAmount = amount / 5;
				if (amount >= 5) {

					System.out.println("Nickel: " + nickelAmount);
					amount -= nickelAmount * 5;
				}

				int pennyAmount = amount / 1;
				if (amount >= 1) {

					System.out.println("Penny: " + pennyAmount);
					amount -= pennyAmount * 1;
				}

			} while (amount > 0);
		} while (choice.equalsIgnoreCase("Y"));

	}
}
