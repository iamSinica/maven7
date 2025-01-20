package maven;

public class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return false;
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) return 0;
        String vowels = "aeiouAEIOU";
        return (int) str.chars()
                .filter(ch -> vowels.indexOf(ch) != -1)
                .count();
    }


    public static int countConsonants(String str) {
        if (str == null || str.isEmpty()) return 0;
        String vowels = "aeiouAEIOU";
        return (int) str.chars()
                .filter(Character::isLetter)
                .filter(ch -> vowels.indexOf(ch) == -1)
                .count();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}