public class Method {
    public static void main(String[] args) {
        String name = "Mushfiq";
        int age = 17;
        hello(name, age);
        
        System.out.println(add(2, 3));
    }

    static void hello(String a, int b) {
        System.out.println("Yooo " + a + ", you are " + b + " years old");
    }

    static int add(int a, int b) {
        return a + b;
    }
}