class MethodOverloading1 {
    // thismethodacceptsint
    private static void display(int a) {
        System.out.println("Got Integer data.");
    }

    // thismethodacceptsStringobject
    private static void display(String a) {
        System.out.println("Got String object.");
    }

    public static void main(String[] args) {
        System.out.println("K039/Zaid Mukaddam");
        display(1);
        display("Hello");
    }
}