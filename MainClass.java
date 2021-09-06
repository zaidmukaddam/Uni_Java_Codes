class A1 {
    public A1() {
        System.out.println("Class A Constructor");
    }
}

class B1 extends A1 {
    public B1() {
        System.out.println("Class B Constructor");
    }
}

class C1 extends B1 {
    public C1() {
        System.out.println("Class C Constructor");
    }
}

public class MainClass {
    public static void main(String[] args) {
        C1 c = new C1();
    }
}