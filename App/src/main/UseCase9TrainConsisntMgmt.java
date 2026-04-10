import java.util.*;
import java.util.stream.Collectors;

// Bogie class (reuse same structure)
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}

// UC9 Class
public class UseCase9TrainConsistMgmt {

    // Method to group bogies by type
    public static Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(b -> b.getType()));
    }

    // Main method (for manual execution)
    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 50));
        bogieList.add(new Bogie("Sleeper", 80));
        bogieList.add(new Bogie("AC Chair", 65));

        System.out.println("Original Bogie List:");
        bogieList.forEach(System.out::println);

        // Grouping logic
        Map<String, List<Bogie>> grouped = groupBogiesByType(bogieList);

        // Display grouped result
        System.out.println("\nGrouped Bogies by Type:");
        grouped.forEach((type, list) -> {
            System.out.println(type + ":");
            list.forEach(b -> System.out.println("  " + b));
        });
    }
}