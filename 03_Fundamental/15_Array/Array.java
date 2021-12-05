public class Array {
	public static void main(String[] args) {
		// Array = Used to store multiple values in a singel variable.

		String[] cars = { "Range Rover", "Tesla", "Lamborgini" }; // This is one way to create an array
		System.out.println("This cars list are made by an array.");
		for (int i = 0; i < 3; i++) {
			System.out.println(cars[i]);
		}

		System.out.println();

		String[] bikes = new String[3]; // This is another way to create an array
		bikes[0] = "BMW";
		bikes[1] = "KTM";
		bikes[2] = "MT";
		System.out.println("This bikes list are made by another array in another way.");
		for (int i = 0; i < bikes.length; i++) {
			System.out.println(bikes[i]);
		}
	}
}