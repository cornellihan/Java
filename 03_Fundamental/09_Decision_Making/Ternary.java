import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        // There is a short-hand if else, which is known as the ternary operator

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey, give your age to browse without hindrance: ");
        int age = scanner.nextInt();
        String result = (age <= 18) ? "You are still not adult! " : "Hey, you can browse what you want.";
        System.out.println(result);

        scanner.close();
    }
}