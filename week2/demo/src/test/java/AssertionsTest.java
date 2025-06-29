import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Basic math
        assertEquals("Addition failed", 5, 2 + 3);

        // Boolean checks
        assertTrue("Condition should be true", 10 > 1);
        assertFalse("Condition should be false", 2 > 3);

        // Null and NotNull
        assertNull("Expected null", null);
        assertNotNull("Expected non-null", new Object());
    }
}