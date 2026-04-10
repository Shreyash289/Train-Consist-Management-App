import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainValidatorTest {

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(TrainValidator.validateTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainValidator.validateTrainID("TRAIN12"));
        assertFalse(TrainValidator.validateTrainID("TRN12A"));
        assertFalse(TrainValidator.validateTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(TrainValidator.validateCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainValidator.validateCargoCode("PET-ab"));
        assertFalse(TrainValidator.validateCargoCode("PET123"));
        assertFalse(TrainValidator.validateCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainValidator.validateTrainID("TRN-123"));
        assertFalse(TrainValidator.validateTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainValidator.validateCargoCode("PET-aB"));
        assertFalse(TrainValidator.validateCargoCode("PET-Ab"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(TrainValidator.validateTrainID(""));
        assertFalse(TrainValidator.validateCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(TrainValidator.validateTrainID("TRN-1234XYZ"));
        assertFalse(TrainValidator.validateCargoCode("PET-AB12"));
    }
}