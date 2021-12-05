import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        // If statement = Performs a block of code if it's condition evaluates to be
        // true.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hey dude, can you please enter your age: ");
        int age = scanner.nextInt();

        if (age >= 75) {
            System.out.print("Hey boomer, what are you doing here..?");
        } else if (age >= 18) {
            System.out.print("You are an adult!");
        } else if (age >= 13) {
            System.out.print("You are a teenager!");
        } else {
            System.out.print("Hey, you are not an adult!");
        }
        scanner.close();
    }
}