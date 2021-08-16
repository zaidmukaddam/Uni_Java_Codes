/**
 * StateBank
 */
class StateBank {
    double p, r, t, si;

    double calculate(double P, double R, double T, double SI) {
        p = P;
        r = R;
        t = T;
        si = SI;
        si = (p * r * t) / 100;
        return si;
    }
}

/**
 * CentralBank
 */
public class CentralBank extends StateBank {

    public static void main(String[] args) {
        System.out.println("K039/Zaid Mukaddam");

        StateBank c = new StateBank();

        System.out.println("Simple Interest of State Bank is " + c.calculate(13000, 12, 2, 0));
        System.out.println("Simple Interest of Central Bank is " + c.calculate(20000, 12, 2, 0));
    }
}
