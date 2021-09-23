package by.mjcschool.zotov.gradle.task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class UtilsTest {
    @Test void isAllPositiveNumbersTest() {
        assertTrue(Utils.isAllPositiveNumbers("1", "2", "3"));
        assertFalse(Utils.isAllPositiveNumbers("1", "-2", "3"));
        assertFalse(Utils.isAllPositiveNumbers("A", "2", "3"));
    }
}