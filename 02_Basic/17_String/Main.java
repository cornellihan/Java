public class Main {
    public static void main(String[] args) {
        String name = "    Mushfiq     ";
        boolean decision = name.equals("mushfiq");      // Btw the String inside the method is case sensitive.
        // This will check if the String 'name' and the String inside the name.equals() method matches or not and will return a boolean value.

        boolean decision2 = name.equalsIgnoreCase("mushfiq");
        // This method and the .equals() method is same but .equals() method is case sensitive but .equalsIgnoreCase() method is not case sensitive

        int length = name.length();
        // This will return the length of the String 'name'

        char letter = name.charAt(2);
        // This will return any character of the String by index

        int decision3 = name.indexOf("fiq");
        // This will return the index of 'fiq' from the String 'name'.

        boolean decision4 = name.isEmpty();
        // This will return if the String 'name' is empty or not as a boolean.

        name = name.toLowerCase();
        // This will transform all the letters of the String in lowercase.

        name = name.toUpperCase();
        // Will transform all the letters of teh String in uppercase.

        name = name.trim();
        // Will remove all the empty spaces before and after the word/sentece from the String.

        String replace = name.replace("MUSHFIQ", "Limon ");
        // Will replace all the 'H' to 'j' in String 'name'. Btw this is case sensitive and the 2 argument should be same. Either it is char, char or String, String

        String concating = replace.concat(name);

        
        System.out.println(concating);
    }
}