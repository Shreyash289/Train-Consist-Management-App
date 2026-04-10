import java.util.*;

class PassengerBogie {
    String type;
    int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class PassengerBogieApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter bogie type (Sleeper/AC/FirstClass): ");
            String type = sc.nextLine();

            System.out.print("Enter capacity: ");
            int capacity = sc.nextInt();

            PassengerBogie bogie = new PassengerBogie(type, capacity);
            System.out.println("Bogie created successfully!");
            System.out.println("Type: " + bogie.getType());
            System.out.println("Capacity: " + bogie.getCapacity());

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}