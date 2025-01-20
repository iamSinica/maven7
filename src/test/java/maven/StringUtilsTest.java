package maven;

import maven.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @ParameterizedTest
    @CsvSource({
            "madam, true",
            "hello, false",
            "radar, true",
            "Java, false",
            "A, true",
            ", false" // Пустая строка
    })
    void testIsPalindrome(String input, boolean expected) {
        assertEquals(expected, StringUtils.isPalindrome(input));
    }

    @ParameterizedTest
    @CsvSource({
            "education, 5",
            "hello, 2",
            "JAVA, 2",
            "xyz, 0",
            ", 0", // Пустая строка
            "AEIOU, 5"
    })
    void testCountVowels(String input, int expected) {
        assertEquals(expected, StringUtils.countVowels(input));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 3",
            "world, 4",
            "JAVA, 2",
            "AEIOU, 0",
            ", 0", // Пустая строка
            "hll, 3"
    })
    void testCountConsonants(String input, int expected) {
        assertEquals(expected, StringUtils.countConsonants(input));
    }

    @ParameterizedTest
    @CsvSource({
            "listen, silent, true",
            "hello, world, false",
            "anagram, nagaram, true",
            "rat, car, false",
            "abc, cba, true",
            ", test, false", // Один из параметров null
            "abc, , false", // Один из параметров null
            ", , false" // Оба параметра null
    })
    void testAreAnagrams(String input1, String input2, boolean expected) {
        assertEquals(expected, StringUtils.areAnagrams(input1, input2));
    }

    @Test
    void testEdgeCases() {
        // Дополнительные проверки для null и пустых строк
        assertFalse(StringUtils.isPalindrome(null));
        assertFalse(StringUtils.isPalindrome(""));
        assertEquals(0, StringUtils.countVowels(null));
        assertEquals(0, StringUtils.countVowels(""));
        assertEquals(0, StringUtils.countConsonants(null));
        assertEquals(0, StringUtils.countConsonants(""));
        assertFalse(StringUtils.areAnagrams(null, "test"));
        assertFalse(StringUtils.areAnagrams("test", null));
        assertFalse(StringUtils.areAnagrams(null, null));
    }
}