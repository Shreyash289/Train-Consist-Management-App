import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Initialize train consist using dynamic collection
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Train initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues...
        System.out.println("System ready for further operations...");
    }
}
