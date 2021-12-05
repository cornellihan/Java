import java.util.Random;
// This is necessary to generate a random values

public class Random {
    public static void main(String[] args) {
        Random random = new Random();
        // We need an instance of the Random class for use

        int x = random.nextInt(6) + 1;
        // Computer starts counting from 0. So if we don't want to get 0, then we need to increment the vlaue with 1
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        boolean z = random.nextBoolean();
        System.out.println(z);
    }
}
