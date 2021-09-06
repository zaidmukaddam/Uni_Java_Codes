class A2 {
    void m1() {
        System.out.println("m1 in class A");
    }
}

class B2 extends A2 {
    void m1() {
        System.out.println("m1 in class B");
    }
}

public class Test2 {
    public static void main(String[] args) {

        B2 b = new B2();
        b.m1();

        A2 a = new A2();
        a.m1();

        A2 a2 = new B2();
        a2.m1();
    }
}
