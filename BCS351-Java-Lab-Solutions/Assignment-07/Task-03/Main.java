// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 7, Task: 3

public class Main {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;

        // Time complexity: O(log n)
        while (n > 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}
