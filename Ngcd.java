import java.math.BigInteger;

public class GCDExample {
    public static void main(String[] args) {
        int[] numbers = {24, 36, 48, 60};

        BigInteger result = BigInteger.valueOf(numbers[0]);
        
        for (int i = 1; i < numbers.length; i++) {
            BigInteger currentNumber = BigInteger.valueOf(numbers[i]);
            result = result.gcd(currentNumber);
        }

        System.out.println("GCD of the array elements: " + result);
    }
}
