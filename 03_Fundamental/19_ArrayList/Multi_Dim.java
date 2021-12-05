import java.util.*;

public class Multi_Dim {
    public static void main(String[] args) {
        // 2D ArrayList = A dynamic list of lists
        // We can change the size of these list during runtime


        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Toast");
        bakeryList.add("Bun");
        bakeryList.add("Cake");
        
        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomato");
        produceList.add("Cabbage");
        produceList.add("Eggplant");
        
        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Sprit");
        drinksList.add("Speed");
        drinksList.add("Red Bull");


        ArrayList<ArrayList<String>> groceryList = new ArrayList<ArrayList<String>>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
	System.out.println(groceryList.get(1).get(2));

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }
}