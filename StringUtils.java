public class StringUtils {
    
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    
    public static boolean isPalindrome(String text) {
        text = text.replaceAll(" ", "").toLowerCase();
        return text.equals(reverse(text));
    }
    
    public static int countVowels(String text) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : text.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
    
    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        String test = "hello world";
        System.out.println("Original: " + test);
        System.out.println("Reversed: " + reverse(test));
        System.out.println("Is Palindrome: " + isPalindrome("racecar"));
        System.out.println("Vowel Count: " + countVowels(test));
        System.out.println("Capitalized: " + capitalizeWords(test));
    }
}
