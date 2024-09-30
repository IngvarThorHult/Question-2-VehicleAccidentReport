import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for vehicle type
        System.out.print("Enter the accident vehicle type (car/bike): ");
        String vehicleType = scanner.nextLine();

        // Prompt for city
        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        // Prompt for total accidents
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int totalAccidents = scanner.nextInt();

        // Display the accident report
        displayAccidentReport(vehicleType, city, totalAccidents);

        // Close the scanner
        scanner.close();
    }

    private static void displayAccidentReport(String vehicleType, String city, int totalAccidents) {
        System.out.println("\nVehicle Accident Report:");
        System.out.printf("Vehicle type: %s%n", vehicleType);
        System.out.printf("City: %s%n", city);
        System.out.printf("Accident total: %d%n", totalAccidents);
    }
}
