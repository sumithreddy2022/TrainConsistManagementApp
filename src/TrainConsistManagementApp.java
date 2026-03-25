import java.util.ArrayList;
import java.util.List;
 class TRAINCONSISTMANAGEMENTAPP {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        List<String> passengerBogies = new ArrayList<>();
        System.out.println("\nAdding passenger bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("Current Passenger Bogies: " + passengerBogies);
        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");
        System.out.println("After Removal: " + passengerBogies);
        System.out.println("\nChecking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present.");
        }
        System.out.println("\nFinal Passenger Bogie List: " + passengerBogies);
        System.out.println("\nTrain system ready for further operations.");
    }
}