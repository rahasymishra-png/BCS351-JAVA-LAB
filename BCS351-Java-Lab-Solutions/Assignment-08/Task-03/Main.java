// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 8, Task: 3

public class Main {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int row = 0; row < m.length; row++) {
            int sum = 0;
            for (int column = 0; column < m[row].length; column++) {
                sum += m[row][column];
            }
            System.out.println("Row " + (row + 1) + " sum: " + sum);
        }
    }
}
