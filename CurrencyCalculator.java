import java.util.Scanner;

public class CurrencyCalculator {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int[] currencies = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };

			System.out.print("Please enter the amount of money: ");
			int moneyAmount = scanner.nextInt();
			while (moneyAmount < 0) {
				System.out.println("It cannot be negative!");
				moneyAmount = scanner.nextInt();
			}
			int remainingAmount = moneyAmount;
			int[] pieces = new int[currencies.length];
			for (int i = 0; i < currencies.length; i++) {
				pieces[i] = remainingAmount / currencies[i];
				if (pieces[i] != 0) {
					System.out.print(currencies[i] + ": ");
					System.out.println(pieces[i] + " pcs");
				}
				remainingAmount = remainingAmount % currencies[i];
			}
		}
	}
}