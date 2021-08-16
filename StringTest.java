public class StringTest {
    public static void main(String args[]) {
        System.out.println("K039/Zaid Mukaddam");
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Integers are not immutable");

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);
    }
}
