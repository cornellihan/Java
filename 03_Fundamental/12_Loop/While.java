import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		// While Loop: Executes a block of code as long as it's condition remains true
		Scanner scanner = new Scanner(System.in);
		String name = "";

		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}

		System.out.println("Hello " + name);
	}
}