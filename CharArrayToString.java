public class CharArrayToString {
    public static void main(String args[]) {
        // character array
        char[] ch = { 'z', 'a', 'i', 'd', ' ', 'm', 'u', 'k', 'k', 'a', 'd', 'a', 'a', 'v', 'a', 't', 'p', 'o', 'i',
                'n', 't' };
        // constructor of the String class that parses char array as a parameter
        String string = new String(ch);
        // prints the string
        System.out.println(string);
    }
}