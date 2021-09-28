package by.mjcschool.zotov.gradle.task1;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String number) {
        boolean result = false;

        if (NumberUtils.isParsable(number)) {
            result = (Double.parseDouble(number) > NumberUtils.DOUBLE_ZERO);
        }

        return result;
    }
}