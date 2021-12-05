public class Type_Casting {
    public static void main(String[] args) {
        /*
            Type casting is when we assign a value of one primitive data type to another type.
            
            In Java, there are two types of casting:

            1. Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            2. Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
         */

         int myInt = 3;
         double myDouble = myInt;           // Automatic casting: int to double
         System.out.println(myDouble);

         double yourDouble = 5.65;
         int yourInt = (int) yourDouble;    // Manual casting: double to int
	 System.out.println(yourInt);
    }
}