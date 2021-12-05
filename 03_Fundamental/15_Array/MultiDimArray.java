public class MultiDimArray {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[0][0] = "Camero";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborgini";
        cars[2][2] = "Tesla";
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();


        // We can create a 2D array in another way-
        String[][] bikes = {
                { "Discover", "Pulser", "Yamaha" },
                { "Gixxer", "Hunk", "Kawasaki" },
                { "MT", "KTM", "BMW" }
        };

        for (int i = 0; i < bikes.length; i++) {
            System.out.println();
            for (int j = 0; j < bikes[i].length; j++) {
                System.out.print(bikes[i][j] + " ");
            }
        }
    }
}
