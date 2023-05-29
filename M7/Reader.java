import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String path = "./text.txt";
        File f = new File(path);

        try {
            BufferedReader read = new BufferedReader(new FileReader(f));
            String isiFile;

            while ((isiFile = read.readLine()) != null) {
                System.out.println(isiFile);
            }
            read.close();
        } catch (IOException e) {
            System.out.println("Error Msg: " + e.getMessage());
        }
    }
}
