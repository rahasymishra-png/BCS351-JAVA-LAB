// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 13, Task: 4

public class Main {
    public static void main(String[] args) {
        String word = "abc";

        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                System.out.println(word.substring(start, end));
            }
        }
    }
}
