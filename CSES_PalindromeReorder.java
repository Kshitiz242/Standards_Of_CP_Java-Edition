//THIS SUBMISSION GOT ACCEPTED(NO TLE ERROR ON THIS ONE)
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String s = scanner.nextLine();
        String palindromeString;
        int odd_count = 0;
        char odd_char = ' ';

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char k = s.charAt(i);
            map.put(k, map.getOrDefault(k, 0) + 1);
        }

        // Build the first half of the palindrome
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if (count % 2 == 1) {
                odd_count++;
                odd_char = character;
            }
            int halfCount = count / 2;
            while (halfCount-- > 0) {
                sb.append(character);
            }
        }

        // Check if a palindrome is possible
        if (odd_count > 1) {
            System.out.println("NO SOLUTION");
        } else {
            // Build the second half of the palindrome
            String reversedHalf = sb.toString();
            sb.append(odd_count == 1 ? odd_char : "")
                    .append(new StringBuilder(reversedHalf).reverse());

            palindromeString = sb.toString();
            System.out.println(palindromeString);
        }

        scanner.close();
    }
}
