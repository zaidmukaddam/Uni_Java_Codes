import java.util.Scanner;

public class PowerOfTwo {
    private static Scanner sc;

    public static void main(String[] args) {
        System.out.println("K039/Zaid Mukaddam");
        int base = 2, exponent;
        sc = new Scanner(System.in);

        System.out.print("Enter an exponent: ");
        exponent = sc.nextInt();
        int save = exponent;

        long result;

        for (result = 1; exponent != 0; --exponent) {
            result *= base;
        }

        System.out.println("2 ^ " + save + " = " + result);
    }
}