import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

        private ArrayList<Vehicle> vehicles;

        public UserInterface() {
            vehicles = new ArrayList<>();
            vehicles.add(new Car("Tesla Model 3", "ABC123", 100, true));
            vehicles.add(new SUV("VW Tiguan", "NNN123", 150, true));
            vehicles.add(new Truck("SCANIA", "MMM333", 200, true));
            vehicles.add(new Convertible("BMW M5", "AAA456", 180, 2));
            vehicles.add(new Convertible("Volvo C5", "CCC555", 180, 4));
        }

        public void showMenu() {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\n--- Vehicle Rental System ---");
                System.out.println("1. View available vehicles");
                System.out.println("2. Rent a vehicle");
                System.out.println("3. Return a vehicle");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1 -> displayVehicles();
                    case 2 -> rentVehicle(scanner);
                    case 3 -> returnVehicle(scanner);
                    case 4 -> {
                        System.out.println("Exiting system. Goodbye!");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Invalid choice, try again.");
                }
            }
        }

        private void displayVehicles() {
            System.out.println("\nAvailable vehicles:");
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.print((i + 1) + ". ");
                vehicles.get(i).displayInfo();
            }
        }

        private void rentVehicle(Scanner scanner) {
            displayVehicles();
            System.out.print("Enter vehicle number to rent: ");
            int vehicleIndex = scanner.nextInt() - 1;
            if (vehicleIndex >= 0 && vehicleIndex < vehicles.size()) {
                System.out.print("Enter number of days to rent: ");
                int days = scanner.nextInt();
                vehicles.get(vehicleIndex).rent(days);
            } else {
                System.out.println("Invalid vehicle number.");
            }
        }

        private void returnVehicle(Scanner scanner) {
            displayVehicles();
            System.out.print("Enter vehicle number to return: ");
            int vehicleIndex = scanner.nextInt() - 1;
            if (vehicleIndex >= 0 && vehicleIndex < vehicles.size()) {
                vehicles.get(vehicleIndex).returnVehicle();
                System.out.println("Rental cost: SEK" + vehicles.get(vehicleIndex).rentCost());
            } else {
                System.out.println("Invalid vehicle number.");
            }
        }


    }


