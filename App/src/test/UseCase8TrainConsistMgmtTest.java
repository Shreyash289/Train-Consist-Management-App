import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase8TrainConsistMgmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 65),
                new Bogie("First Class", 50)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertEquals(1, result.size());
        assertEquals(80, result.get(0).getCapacity());
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 70)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> list = Arrays.asList(
                new Bogie("First Class", 50),
                new Bogie("AC Chair", 60)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 75),
                new Bogie("AC Chair", 80),
                new Bogie("First Class", 50)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 40),
                new Bogie("AC Chair", 50)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 90)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertEquals(list.size(), result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> list = new ArrayList<>();

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> list = new ArrayList<>();
        list.add(new Bogie("Sleeper", 80));
        list.add(new Bogie("AC Chair", 50));

        int originalSize = list.size();

        UseCase8TrainConsisntMgmt.filterBogiesByCapacity(list, 60);

        assertEquals(originalSize, list.size());
    }
}