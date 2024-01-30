import java.util.Scanner;

class Pair<F, S> {
    public F first;
    public S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

public class ArrayPairInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int m = scanner.nextInt();

        int[] array2 = new int[m];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }

        Pair<int[], int[]> arraysPair = new Pair<>(array1, array2);

        // Access the arrays using arraysPair.first and arraysPair.second
        System.out.println("First array: " + Arrays.toString(arraysPair.first));
        System.out.println("Second array: " + Arrays.toString(arraysPair.second));
    }
}
