import java.util.*;
import java.util.stream.Collectors;

// Bogie class
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " - Capacity: " + capacity;
    }
}

// Use Case 8 Logic Class
public class UseCase8TrainConsisntMgmt {

    // Method to filter bogies using Stream API
    public static List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    // Main method (for manual run)
    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 50));
        bogieList.add(new Bogie("Sleeper", 80));
        bogieList.add(new Bogie("AC Chair", 65));

        System.out.println("Original List:");
        bogieList.forEach(System.out::println);

        List<Bogie> filtered = filterBogiesByCapacity(bogieList, 60);

        System.out.println("\nFiltered List (Capacity > 60):");
        filtered.forEach(System.out::println);
    }
}