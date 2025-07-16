import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %-15s : left-align the string in a 15-character field
            // %03d   : pad the number to 3 digits with leading zeros
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");
    }
}

//%-15s

// %s → Print a string.

//15 → Use exactly 15 characters wide space.

//- → Left-align the string (pad the right side with spaces).

{/*503d */}

 // %d → Print an integer.

// 3 → Total width = 3 characters.

// 0 → Pad with zeroes (not spaces) on the left if number is shorter.