import java.util.ArrayList;

public class For_Each {
    public static void main(String[] args) {
        /*
        for-each = traversing technique to iterate through the elements in an array/collection
                   less steps, more readable
                   less flexible
        */


        String[] animals = {"Cat", "Cow", "Bull"};
        for (String i : animals) {
            System.out.print(i + " ");
        }

        System.out.println();

        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("MT");
        bikes.add("KTM");
        bikes.add("BMW");
        for (String i : bikes) {
            System.out.print(i + " ");
        }
    }
}
