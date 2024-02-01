import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class PairListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList of Pair
        ArrayList<Pair> pairList = new ArrayList<>();

        // Reading input in pairs
        System.out.print("Enter the number of pairs: ");
        int numberOfPairs = scanner.nextInt();

        for (int i = 0; i < numberOfPairs; i++) {
            System.out.print("Enter pair " + (i + 1) + " (x y): ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            pairList.add(new Pair(x, y));
        }

        // Sorting based on the first entries of pairs
        Collections.sort(pairList, (a, b) -> Integer.compare(a.x, b.x));

        System.out.println("Sorted based on the first entries:");
        printPairs(pairList);

        // Sorting based on the second entries of pairs
        Collections.sort(pairList, (a, b) -> Integer.compare(a.y, b.y));

        System.out.println("Sorted based on the second entries:");
        printPairs(pairList);

        scanner.close();
    }

    static void printPairs(ArrayList<Pair> pairs) {
        for (Pair pair : pairs) {
            System.out.println("(" + pair.x + ", " + pair.y + ")");
        }
        System.out.println();
    }
}
