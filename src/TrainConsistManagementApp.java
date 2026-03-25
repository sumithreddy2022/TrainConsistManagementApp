import java.util.*;
public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        runUC2();
        runUC3();
        System.out.println("\nTrain system ready for further operations.");
    }
    // UC2: Passenger Bogies using List
    static void runUC2() {
        List<String> passengerBogies = new ArrayList<>();
        System.out.println("\n--- UC2: Managing Passenger Bogies ---");
        System.out.println("Adding passenger bogies...");
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
        System.out.println("Final Passenger Bogie List: " + passengerBogies);
    }
    // UC3: Unique Bogie IDs using Set
    static void runUC3() {
        Set<String> bogieIds = new HashSet<>();
        System.out.println("\n--- UC3: Managing Unique Bogie IDs ---");
        System.out.println("Adding bogie IDs...");
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate
        System.out.println("\nUnique Bogie IDs in Train:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
        System.out.println("Train system ensures no duplicate bogie IDs.");
    }
}