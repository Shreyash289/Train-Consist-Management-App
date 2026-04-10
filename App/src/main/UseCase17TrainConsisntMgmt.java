import java.util.*;

public class BogieSortApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieNames = new String[n];

        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        // Sorting using built-in method
        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        sc.close();
    }
}