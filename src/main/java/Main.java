import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Car currentCar = new Car(294, "Ford Fiesta", 0);
    static Bicycle currentBike = new Bicycle(299, "Conway MC400", 0);
    static Vehicle currentVehicle;
    static String[] nextInput =  {"",""};

    public static void main(String[] args) {
        System.out.println("Choose vehicle");
        String vehicle = scanner.nextLine();        //Scan vehicle Type from user input
        if(vehicle.equals("Car")) {                 //This if-block sets the current vehicle type
            System.out.println("Car ready");
            currentVehicle= currentCar;
        } else if (vehicle.equals("Bicycle")) {
            System.out.println("Bicycle ready");
            currentVehicle = currentBike;
        }
        while (!nextInput[0].equals("end")) {         //executes "Accelerate and "Brake" commands until user types "end"
            nextInput = scanner.nextLine().split(" ");
            if (nextInput[0].equals("Accelerate")) {
                currentVehicle.accelerate(Integer.parseInt(nextInput[1]));
            } else if (nextInput[0].equals("Brake")) {
                currentVehicle.brake();
                System.out.println(currentVehicle.getVelocity());
            }
        }
    }
}
