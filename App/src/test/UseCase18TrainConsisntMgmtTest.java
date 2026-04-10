import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    @Test
    void testSearch_BogieFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(LinearSearchApp.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] arr = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(LinearSearchApp.linearSearch(arr, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        assertTrue(LinearSearchApp.linearSearch(arr, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] arr = {"BG101","BG205","BG309"};
        assertTrue(LinearSearchApp.linearSearch(arr, "BG309"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] arr = {"BG101"};
        assertTrue(LinearSearchApp.linearSearch(arr, "BG101"));
    }
}