import java.util.Scanner;

/**
 * Debit
 */
class Debit {
    String debitAccountString;
    int debit;

    public int debitAccount(String acc, int Balance, int amount) {
        debitAccountString = acc;
        debit = Balance - amount;
        Balance = debit;
        return Balance;
    }
}

/**
 * Credit
 */
class Credit extends Debit {
    String creditAccountString;
    int credit;

    public int creditAccount(String acc, int Balance, int amount) {
        creditAccountString = acc;
        credit = Balance + amount;
        Balance = credit;
        return Balance;
    }
}

/**
 * Account
 */
class Account extends Credit {
    String name;
    String acc;
    int balance;

    public void updateBalance(int Balance) {
        balance = Balance;
    }

    public void account(String Name, String Acc, int Balance) {
        name = Name;
        acc = Acc;
        balance = Balance;
    }
}

/**
 * DisplayAcc
 */
public class DisplayAcc {
    public static void main(String[] args) {
        int n = 0;

        Scanner s = new Scanner(System.in);
        Account a = new Account();

        a.account("K039/Zaid Mukaddam", "1000211", 10000);
        System.out.println(
                "\nCreated account of Account No. : " + a.acc + " of " + a.name + " with balance " + a.balance + ".");
        while (n != 4) {
            System.out.println("\n1. Display Account Details\n2. Debit Account by 1000\n3. Credit Account by 1000\n4. Exit\nEnter a choice: ");
            n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Account No. : " + a.acc + " of " + a.name + " with balance " + a.balance + ".");
                    break;
                case 2:
                    a.debitAccount(a.acc, a.balance, 1000);
                    a.updateBalance(a.debit);
                    System.out.println("Current Balance is " + a.debit);
                    break;
                case 3:
                    a.creditAccount(a.acc, a.balance, 1000);
                    a.updateBalance(a.credit);
                    System.out.println("Current Balance is " + a.credit);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong Input");
                    break;
            }
        }
        s.close();
    }
}
