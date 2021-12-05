public class Overload {
    public static void main(String[] args) {
        /* Overload Method = Methods that share the same name but have different parameters
                             method name + parameters = method signature                    */


        int x = add(1, 2, 3, 4);
        System.out.println(x);
        double y = add(1.0, 2.3, 3);
        System.out.println(y);
    }                        

    // Making methods with integer type
    static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }

    // Making methods with double type
    static double add(double a, double b) {
        System.out.println("This is overloading mehtod #4");
        return a + b;
    }
    static double add(double a, double b, double c) {
        System.out.println("This is overloading mehtod #5");
        return a + b + c;
    }
    static double add(double a, double b, double c, double d) {
        System.out.println("This is overloading mehtod #6");
        return a + b + c + d;
    }
}