import java.util.HashMap;
import java.util.Map;

public class TrainAppUC6 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogies with their capacities
        bogieCapacity.put("Sleeper", 72);       // 72 seats
        bogieCapacity.put("AC Chair", 56);      // 56 seats
        bogieCapacity.put("First Class", 24);   // 24 seats

        // Iterate through the map and display bogie capacities
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}
