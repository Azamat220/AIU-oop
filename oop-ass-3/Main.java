import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of devices you want to create (1-20): ");
        int numDevices = scanner.nextInt();
        scanner.nextLine(); 

        if (numDevices < 1 || numDevices > 20) {
            System.out.println("Please enter a valid number between 1 and 20.");
            return;
        }

        
        ArrayList<Device> devices = new ArrayList<>();
        Random random = new Random();
        String[] deviceTypes = { "Smartphone", "Laptop", "Tablet", "Desktop", "Smartwatch" };

        for (int i = 0; i < numDevices; i++) {
            String randomType = deviceTypes[random.nextInt(deviceTypes.length)];
            double randomPrice = 100 + random.nextDouble() * 1900; 
            double randomWeight = 200 + random.nextDouble() * 1800; 

            Device device = new Device(randomType, randomPrice, randomWeight);
            devices.add(device);
        }

        
        Set<String> distinctTypes = new HashSet<>();
        double totalPrice = 0;
        double totalWeight = 0;

        for (Device device : devices) {
            distinctTypes.add(device.getType());
            totalPrice += device.getPrice();
            totalWeight += device.getWeight();
        }

        System.out.println("\nInformation:");
        System.out.println("Number of distinct device types created: " + distinctTypes.size());
        System.out.println("Total price of all devices: $" + totalPrice);
        System.out.println("Total weight of all devices: " + totalWeight + " grams");

        scanner.close();
    }
}
`