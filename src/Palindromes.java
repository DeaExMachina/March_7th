import java.util.Locale;

public class Palindromes {
    public static void main(String[] args) {
        //isPalindrome("Anna");
        System.out.println(isPalindrome("Anna"));

    }

    public static boolean isPalindrome (String potentialPalindrome) {
        potentialPalindrome = potentialPalindrome.toLowerCase();
        potentialPalindrome = potentialPalindrome.replace("'", "");
        potentialPalindrome = potentialPalindrome.replace(",", "");
        potentialPalindrome = potentialPalindrome.replace(" ", "");

        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt(potentialPalindrome.length()-1);

        if (firstLetter == lastLetter) {
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length()-1);

            if (potentialPalindrome.length() <= 1) {
                return true;
            }

            return isPalindrome(potentialPalindrome);
        }
        return false;
    }
}
