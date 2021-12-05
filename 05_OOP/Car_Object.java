public class Car_Object {
    public static void main(String[] args) {
        Car_Class myCar = new Car_Class();
        
        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();
        myCar.brake();
    }
}