import java.util.Scanner;
// We will create a project that will give us the hypotenuse of a triangle

public class Project {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side x of the triangle: ");
        x = scanner.nextDouble();
        System.out.print("Enter side y of the triangle: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x * x) + (y * y));
        System.out.println("The hypotenuse of the triangle is: " + z);

        scanner.close();
    }
}
