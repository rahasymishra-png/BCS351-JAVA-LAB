// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 9, Task: 2

public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int column = 0; column < 3; column++) {
            int sum = 0;
            for (int row = 0; row < 3; row++) {
                sum += m[row][column];
            }
            System.out.println("Column " + (column + 1) + " sum: " + sum);
        }
    }
}
