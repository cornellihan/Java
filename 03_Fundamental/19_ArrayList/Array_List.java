import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        /*
        ArrayList = It's a type of resizable array.
                    Elements can be added and removed after compilation phase
                    It stores only reference data types
        */


        ArrayList<String> food = new ArrayList<String>();
        food.add("GTA 5");
        food.add("Agontuk");
        food.add("CyberPunk");
        System.out.println(food);


        food.set(0, "San Andreas");
        // Will modify the value "Agontuk" in index 0
        food.remove(1);
        // Will remove the value at the certain index. For example here the index is 1
        food.clear();
        // Will remove all the elements from the array and we will no longer have any elements within our ArrayList of food

        for (int i = 0; i < food.size(); i++) { // In ArrayList, we use food.size() instead of food.length()
            System.out.println(food.get(i));
        }
    }
}