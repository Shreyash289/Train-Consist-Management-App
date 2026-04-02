import java.util.LinkedHashSet;
import java.util.Set;

public class TrainAppUC5 {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // Attach bogies in sequence
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Attempt to attach duplicate bogie
        trainFormation.add("Sleeper"); // duplicate ignored

        // Display final formation
        System.out.println("Final train formation (in order): " + trainFormation);
    }
}
