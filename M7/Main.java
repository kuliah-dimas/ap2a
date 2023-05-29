import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "./";
        File f = new File(path, "text.txt");

        try {
            FileWriter tulis = new FileWriter(f);
            tulis.write("Aku gg\n");
            tulis.write("Kamu cupu\n");
            tulis.close();
        } catch (IOException e) {
            System.out.println("Error msg: " + e.getMessage());
        }
    }
}
