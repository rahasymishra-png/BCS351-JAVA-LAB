// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 4, Task: 2

public class Main {
    static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static int nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
