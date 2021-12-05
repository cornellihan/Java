public class Switch {
    public static void main(String[] args) {
        // Switch = Statement that allows a variable or other values to be tested for
        // equality against a list of values.

        String day = "Monday";
        switch (day) { // Inside the parentheses, we list the value or variable we would like to test for equality against a list of cases
            case "Sunday":
                System.out.print("It is Sunday.");
                break;
            case "Monday":
                System.out.print("It is Monday.");
                break;
            case "Tuesday":
                System.out.print("It is Tuesday.");
                break;
            case "Wednesday":
                System.out.print("It is Wednesday.");
                break;
            case "Thursday":
                System.out.print("It is Thursday.");
                break;
            case "Friday":
                System.out.print("It is Friday.");
                break;
            case "Saturday":
                System.out.print("It is Saturday");
            default:
                System.out.print("That is not a day!");
        }
    }
}