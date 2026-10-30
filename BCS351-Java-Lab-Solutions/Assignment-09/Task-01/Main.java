// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 9, Task: 1

public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int value : m[0]) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Last row: ");
        for (int value : m[m.length - 1]) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
