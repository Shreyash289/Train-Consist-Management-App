import java.util.*;

public class SearchValidationApp {

    // Search with validation
    public static boolean searchBogie(String[] bogieIds, String key) {

        // Fail-fast check
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // You can use linear or binary search (here: linear)
        for (String id : bogieIds) {
            if (id.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter bogie ID: ");
            bogieIds[i] = sc.nextLine();
        }

        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        try {
            boolean found = searchBogie(bogieIds, key);

            if (found) {
                System.out.println("Bogie ID FOUND");
            } else {
                System.out.println("Bogie ID NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}