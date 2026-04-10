import java.util.*;
import java.util.stream.*;

class Bogie {
    int capacity;

    public Bogie(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class PerformanceComparisonApp {

    // Loop-based filtering
    public static List<Bogie> filterWithLoop(List<Bogie> bogies) {
        List<Bogie> result = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }
        return result;
    }

    // Stream-based filtering
    public static List<Bogie> filterWithStream(List<Bogie> bogies) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        // Creating dataset
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie((int)(Math.random() * 100)));
        }

        // Loop timing
        long startLoop = System.nanoTime();
        List<Bogie> loopResult = filterWithLoop(bogies);
        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        // Stream timing
        long startStream = System.nanoTime();
        List<Bogie> streamResult = filterWithStream(bogies);
        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        // Output
        System.out.println("Loop Result Size: " + loopResult.size());
        System.out.println("Stream Result Size: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}