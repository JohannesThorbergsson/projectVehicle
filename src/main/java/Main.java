import java.util.Scanner;

public class Main {
    static Scanner scanVehicle= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose vehicle");
        if(scanVehicle.nextLine().equals("Car")) {
            System.out.println("Car ready");
            Car currentCar = new Car(294, "Ford Fiesta", 0);
            while (true) {
                if (scanVehicle.hasNextLine()) {
                    currentCar.accelerate(5);
                    System.out.println(currentCar.getVelocity());
                }

            }
        }
    }
}
