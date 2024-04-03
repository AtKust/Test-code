import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File exists.");

            // Read the content of the file
            try {
                FileReader reader = new FileReader(file);
                int character;
                while ((character = reader.read()) != -1) {
                    System.out.print((char) character);
                }
                reader.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
