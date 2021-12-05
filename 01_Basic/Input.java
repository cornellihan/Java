import java.util.Scanner;
// To take input form user, we need to import Scanner class

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We need to make an object from Scanner class to take inputs from user.

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("How old are you ?");
        int age = scanner.nextInt();

        scanner.nextLine();
        // We need to add this line of code after taking an integer type value and want to take another String type value.

        System.out.println("What is your favourite food ?");
        String food = scanner.nextLine();

        // Printing all the values
        System.out.println("Hey " + name + ", you are " + age + " years old and your favourite food is " + food);


        // Another special type of input-
        String key = scanner.next();
        // Here next method will store the next key that the user press as a String.
        System.out.print(key);


        scanner.close();
    }
}
