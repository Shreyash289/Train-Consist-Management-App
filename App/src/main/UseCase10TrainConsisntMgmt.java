import java.util.*;
import java.util.stream.*;

// Reuse Bogie class
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

// UC10 Class
public class UseCase10TrainConsistMgmt {

    // Method to calculate total seating capacity using reduce()
    public static int calculateTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.getCapacity())        // extract capacity
                .reduce(0, Integer::sum);        // aggregate
    }

    // Main method (manual run)
    public static void main(String[] args) {

        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 60));
        bogieList.add(new Bogie("First Class", 50));
        bogieList.add(new Bogie("Sleeper", 80));
        bogieList.add(new Bogie("AC Chair", 65));

        System.out.println("Bogie List:");
        bogieList.forEach(System.out::println);

        int totalSeats = calculateTotalCapacity(bogieList);

        System.out.println("\nTotal Seating Capacity: " + totalSeats);
    }
}