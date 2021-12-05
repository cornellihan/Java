// This is tutorial 02 from Bro Code

public class Variable {
    public static void main(String[] args) {

      int name;       // This is called variable declaration
      name = 10;      // This is called variable assignment
      System.out.println(name);

        /*
         DATA TYPE           SIZE            PRIM/REF            VALUE

        * boolean            1 bit           primitive           true or false
          byte              1 byte           primitive           -128 to 127
          short             2 bytes          primitive           -32,768 to 32,767
        * int               4 bytes          primitive           -2 billion to billion
          long              8 bytes          primitive           -9 quintillion to 9 quintillion. ex- 12334233424L

          float             4 bytes          primitive           fractional numbers up to 6-7 decimal digits like 3.141642f
        * double            8 bytes          primitive           fractional numbers up to 15 decimal digits. ex- 19.99d

        * char              2 bytes          primitive           singel character/letter/ASCII value
        * String            varies           reference           a sequence of characters






        PRIMITIVE                         VS                         REFERENCE

        8 types (boolean, byte, etc.)                                user defined and unlimited (String, Array, Classes, etc.)
        stores data                                                  stores address
        can only hold 1 value                                        could hold more than 1 value
        less memory                                                  more memory
        fast                                                         slower
        starts with a small letter                                   starts with a capital letter
        */
    }
}
