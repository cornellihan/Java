public class Main {
    public static void main(String[] args) {
        double x = 3.24;
        double y = -10;
        /*
            Math.max(x, y);     ==>     This will show biggest value between x and y
            Math.min(x, y)      ==>     This will show lowest value betwen x and y
            Math.abs(y)         ==>     This will show absolute (positive) value of y
            Math.sqrt(y)        ==>     This will show the square root of x
            Math.round(x)       ==>     Will give the integer value of the double, like it will give 3
            Math.ceil(x)        ==>     Will give the full number of that double, like it will give 4
            Math.random()       ==>     Returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
         */

        int a = (int)(Math.random() * 101);
    	System.out.println(a);
    }
}