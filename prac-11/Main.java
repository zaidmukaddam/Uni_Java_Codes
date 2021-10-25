import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {

        File file = new File("JavaFile.java");

        try {

            boolean value = file.createNewFile();
            String program = 
            "class JavaFile { " + "\n" + 
            "      public static void main(String[] args) { " + "\n" + 
            "             System.out.println(\"This is file\");" + "\n" + 
            "    }" + "\n" + 
            "}";
            if (value) {
                FileWriter output = new FileWriter(file);
                output.write(program);
                System.out.println("New Java File is created.");
                System.out.println("Data is written to the file.");
                output.close();
            } else {
                System.out.println("The file already exists.");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}