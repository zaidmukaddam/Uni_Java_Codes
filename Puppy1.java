public class Puppy1 {
    public Puppy1(String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name);
    }

    public static void main(String[] args) {
        // Following statement would create an object myPuppy
        Puppy1 myPuppy = new Puppy1("tommy");
    }
}