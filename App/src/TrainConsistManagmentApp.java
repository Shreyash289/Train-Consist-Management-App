import java.util.HashSet;
import java.util.Set;

public class TrainAppUC3 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG104");
        bogieIDs.add("BG102"); // duplicate

        // Display final set (duplicates automatically removed)
        System.out.println("Unique bogie IDs in train consist: " + bogieIDs);

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}
