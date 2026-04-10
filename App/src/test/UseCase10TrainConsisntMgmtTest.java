import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistMgmtTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 70),
                new Bogie("AC Chair", 60)
        );

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(130, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60),
                new Bogie("First Class", 50)
        );

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(182, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80)
        );

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(80, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(0, result);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 40),
                new Bogie("AC Chair", 60)
        );

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(100, result);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 10),
                new Bogie("AC Chair", 20),
                new Bogie("First Class", 30)
        );

        int result = UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(60, result);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 70));
        list.add(new Bogie("AC Chair", 60));

        int originalSize = list.size();

        UseCase10TrainConsistMgmt.calculateTotalCapacity(list);

        assertEquals(originalSize, list.size());
    }
}