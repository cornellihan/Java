import javax.swing.JOptionPane;
// We need to import JOptionPane class to work with GUI

public class GUI_Intro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you ?"));
        // The JOptionPane will return a String type data, so we need to convert it in int by the method- Integer.parseInt
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "Hey " + name + " enter your height please"));
        // We need to convert String that will be returned from JOptionPane to double by Double.parseDouble method

        JOptionPane.showMessageDialog(null, "Hey " + name + ", you are " + age + " years old.");
        JOptionPane.showMessageDialog(null, "And your height is " + height);
    }
}
