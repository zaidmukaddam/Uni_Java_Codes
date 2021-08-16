import java.util.Scanner;

public class PersonPassOrFail {
    private static Scanner sc;

    public static void main(String[] args) {
        System.out.println("K039/Zaid Mukaddam");
        int score;
        String grade = "";
        sc = new Scanner(System.in);

        System.out.print("Enter your score: ");
        score = sc.nextInt();

        if (score <= 100 && score > 80) {
            grade = "1st Class";
        } else if (score >= 65) {
            grade = "2nd Class";
        } else if (score < 55) {
            grade = "3rd Class";
        } else {
            grade = "Fail :(";
        }

        System.out.println("You're Grade is - " + grade);

    }
}
