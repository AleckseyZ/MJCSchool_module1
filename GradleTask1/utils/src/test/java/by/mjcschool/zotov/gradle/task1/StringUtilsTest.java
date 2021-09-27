package by.mjcschool.zotov.gradle.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class StringUtilsTest {
    @Test void positiveNumberTest() {
        assertFalse(StringUtils.isPositiveNumber("F"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertTrue(StringUtils.isPositiveNumber("1"));
    }
}