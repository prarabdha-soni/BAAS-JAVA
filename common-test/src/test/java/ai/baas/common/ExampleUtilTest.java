package ai.baas.common;

import ai.baas.common.util.ExampleUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleUtilTest {
    @Test
    void testToUpper() {
        assertEquals("HELLO", ExampleUtil.toUpper("hello"));
        assertNull(ExampleUtil.toUpper(null));
    }
}
