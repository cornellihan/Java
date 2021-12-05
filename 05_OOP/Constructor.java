public class Constructor {
    public static void main(String[] args) {
        // Constructor = special method that is called when an object is instantiated

        Health_Class human = new Health_Class("Mushfiq", 17, 64.9);
        Health_Class human2 = new Health_Class("Afif", 17, 60.2);
        System.out.println(human.name);
        System.out.println(human2.weight);
    }
}