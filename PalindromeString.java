import java.util.*;

public class PalindromeString {
    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");

        String og, rev = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome: ");
        og = in.nextLine();
        int length = og.length();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + og.charAt(i);
        if (og.equals(rev))
            System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string isn't a palindrome.");
        
        in.close();
    }
}