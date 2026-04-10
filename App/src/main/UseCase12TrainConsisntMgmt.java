import java.util.*;
import java.util.stream.*;

class GoodsBogie {
    String type;
    String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }
}

public class SafetyComplianceApp {

    public static boolean isTrainSafe(List<GoodsBogie> bogies) {
        return bogies.stream()
                .allMatch(b ->
                        !b.getType().equalsIgnoreCase("Cylindrical")
                                || b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<GoodsBogie> bogies = new ArrayList<>();

        System.out.print("Enter number of goods bogies: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter type of bogie (Cylindrical/Open/Box): ");
            String type = sc.nextLine();

            System.out.println("Enter cargo type: ");
            String cargo = sc.nextLine();

            bogies.add(new GoodsBogie(type, cargo));
        }

        boolean isSafe = isTrainSafe(bogies);

        if (isSafe) {
            System.out.println("Train is SAFETY COMPLIANT");
        } else {
            System.out.println("Train is NOT SAFE");
        }

        sc.close();
    }
}