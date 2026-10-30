// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 5, Task: 3

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;

        for (int value : arr) {
            if (value > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}
