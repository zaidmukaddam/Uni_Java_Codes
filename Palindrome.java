import java.util.Scanner;

public class Palindrome {
    private static Scanner sc;

    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");
        int r, sum = 0, temp;
        sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10; 
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println(temp + " is palindrome number ");
        else
            System.out.println(temp + " is not palindrome");
    }
}
