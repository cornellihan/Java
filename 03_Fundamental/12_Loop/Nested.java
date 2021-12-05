import java.util.Scanner;

public class Nested {
	public static void main(String[] args) {
		// Nested Loop = a loop inside of a loop. It consists with a outer loop and some inner loop.

		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";

		System.out.print("Enter the number of rows: ");
		rows = scanner.nextInt();
		System.out.print("Enter the number of column: ");
		columns = scanner.nextInt();
		System.out.print("Enter symbol to use: ");
		symbol = scanner.next();

		for(int i = 1; i <= rows; i++) {
			System.out.println();
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
			}
		}
	}
}