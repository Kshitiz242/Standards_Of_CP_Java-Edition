//This code is far off from the solution of the Codechef problem MD_RIEV but it gives insights to some pretty useful techniques such as 
//finding out the number of digits in a number in O(1) time

import java.util.Scanner;

class Codechef {
    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        int dig;
        while (n != 0) {
            dig = n % 10;
            rev = rev * 10 + dig;
            n = n / 10;
        }
        return temp == rev;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        // Check divisibility up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int countDigits(int n) {
        if (n == 0) {
            return 1; // Special case for 0
        }

        // Calculate the number of digits using logarithm
        return (int) Math.log10(Math.abs(n)) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        while (T-- != 0) {
            int N = scanner.nextInt();
            int even_ct = 0;
            int odd_ct = 0;

            int i = 1;
            while (N > 0) {
                if (isPrime(i) && isPalindrome(i)) {
                    int digits = countDigits(i);
                    if (digits % 2 == 0) {
                        even_ct++;
                    } else {
                        odd_ct++;
                    }
                    N--;
                }
                i++;
            }
            System.out.println(even_ct + " " + odd_ct);
        }

        scanner.close();
    }
}
