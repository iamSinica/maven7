package maven;

public class StringUtils {
    // Проверка на палиндром
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed); // Игнорируем регистр
    }

    // Подсчет количества гласных букв
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) return 0;
        String vowels = "aeiouAEIOU"; // Учет заглавных и строчных букв
        return (int) str.chars()
                .filter(ch -> vowels.indexOf(ch) != -1) // Проверяем, что символ - гласная
                .count();
    }

    // Подсчет количества согласных букв
    public static int countConsonants(String str) {
        if (str == null || str.isEmpty()) return 0;
        String vowels = "aeiouAEIOU"; // Гласные
        return (int) str.chars()
                .filter(Character::isLetter) // Убедимся, что символ - буква
                .filter(ch -> vowels.indexOf(ch) == -1) // Исключаем гласные
                .count();
    }

    // Проверка на анаграмму
    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        // Убираем пробелы и приводим к одному регистру
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        // Сортируем и сравниваем
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}