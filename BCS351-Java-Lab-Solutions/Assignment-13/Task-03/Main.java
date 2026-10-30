// Name: Rahasy Mishra
// Roll Number: 2510303405
// Student ID: BCS2025548
// Assignment: 13, Task: 3

public class Main {
    public static void main(String[] args) {
        String word = "racecar";
        boolean palindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
}
