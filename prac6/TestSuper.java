class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);// prints color of Dog class
        System.out.println(super.color);// prints color of Animal class
    }
}

public class TestSuper {
    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");

        Dog d = new Dog();
        d.printColor();
    }
}