import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Samuel Rich Adiela
 */
public class BackNavigationStringMatchingAlgorithmTest {
    @Test
    public void testPatternFound() {
        String text = "THIS IS A TEST STRING";
        String pattern = "TEST";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        assertEquals(10, position, "Pattern should be found at index 10");
    }

    @Test
    public void testPatternNotFound() {
        String text = "THIS IS A TEST STRING";
        String pattern = "NOTHERE";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        assertEquals(-1, position, "Pattern should not be found in the text");
    }

    @Test
    public void testEmptyPattern() {
        String text = "THIS IS A TEST STRING";
        String pattern = "";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        assertEquals(-1, position, "Empty pattern should not be found in the text");
    }

    @Test
    public void testEmptyText() {
        String text = "";
        String pattern = "TEST";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        assertEquals(-1, position, "Pattern should not be found in an empty text");
    }

    @Test
    public void testPatternAtEnd() {
        String text = "TEST";
        String pattern = "TEST";

        int position = BackNavigationStringMatchingAlgorithm.bsma(text, pattern);

        assertEquals(0, position, "Pattern should be found at the start of the text");
    }
}
