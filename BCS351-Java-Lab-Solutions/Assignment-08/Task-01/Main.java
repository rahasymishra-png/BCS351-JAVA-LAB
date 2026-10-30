// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 8, Task: 1

public class Main {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int value = 1;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = value++;
            }
        }

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                System.out.print(m[row][column] + " ");
            }
            System.out.println();
        }
    }
}
