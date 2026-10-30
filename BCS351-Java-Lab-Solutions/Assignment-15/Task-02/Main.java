// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 15, Task: 2

public class Main {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(',');
        }

        numbers.deleteCharAt(numbers.length() - 1);
        System.out.println(numbers);
    }
}
