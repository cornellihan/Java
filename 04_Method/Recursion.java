public class Recursion {
    public static void main(String[] args) {
        // Recursion is nothing but calling a function by itself.
        // Every recursive function should have a halting condition, which is the condition where the function stops calling itself.

        System.out.println(myRecursive(5, 10));
    }

    
    // Write a recursive function which returns by adding a range of numbers between a start and an end
    static int myRecursive(int start, int end) {
        if (start < end) {
            return end + myRecursive(start, end - 1);
        } else {
            return end;
        }
    }
    // Here the halting condition for the recursive function is when end is not greater than start
}
