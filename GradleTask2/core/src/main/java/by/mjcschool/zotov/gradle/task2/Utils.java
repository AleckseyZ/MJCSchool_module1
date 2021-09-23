package by.mjcschool.zotov.gradle.task2;
import by.mjcschool.zotov.gradle.task1.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        boolean allPositive=true;
        for(String number:str) {
            if (!StringUtils.isPositiveNumber(number)) {
                allPositive=false;
                break;
            }
        }
        return allPositive;
    }
}
