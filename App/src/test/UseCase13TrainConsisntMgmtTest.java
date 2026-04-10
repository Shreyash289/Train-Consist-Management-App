import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceComparisonTest {

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie(50),
                new Bogie(70),
                new Bogie(80)
        );

        List<Bogie> result = PerformanceComparisonApp.filterWithLoop(list);
        assertEquals(2, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie(40),
                new Bogie(65),
                new Bogie(90)
        );

        List<Bogie> result = PerformanceComparisonApp.filterWithStream(list);
        assertEquals(2, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> list = Arrays.asList(
                new Bogie(30),
                new Bogie(70),
                new Bogie(80)
        );

        int loopSize = PerformanceComparisonApp.filterWithLoop(list).size();
        int streamSize = PerformanceComparisonApp.filterWithStream(list).size();

        assertEquals(loopSize, streamSize);
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Bogie(i));
        }

        long start = System.nanoTime();
        PerformanceComparisonApp.filterWithLoop(list);
        long end = System.nanoTime();

        long time = end - start;
        assertTrue(time > 0);
    }

    @Test
    void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie(i % 100));
        }

        List<Bogie> result = PerformanceComparisonApp.filterWithStream(list);
        assertNotNull(result);
    }
}