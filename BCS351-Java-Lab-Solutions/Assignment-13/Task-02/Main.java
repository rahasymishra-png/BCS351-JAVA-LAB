// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 13, Task: 2

public class Main {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        System.out.println("Reversed: " + reversed);
    }
}
