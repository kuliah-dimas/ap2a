import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NO1 {
    public static void main(String[] args) {
        MyFile myFile = new MyFile();
        Scanner in = new Scanner(System.in);

        String path = "./";

        System.out.print("Masukkan nama file (tanpa .txt): ");
        String name = in.nextLine();
        System.out.println();

        File file = new File(path, name + ".txt");
        myFile.MakeFile(file);

        while (true) {
            System.out.print("Masukkan isi teks: ");
            String text = in.nextLine();
            myFile.WriteFile(file, text);

            System.out.print("Mau nambah file? (y/n): ");
            String nambah = in.nextLine();
            if (nambah.equalsIgnoreCase("n")) {
                break;
            }

            System.out.println();
        }

        myFile.ReadFile(file);
    }
}

class MyFile {
    void MakeFile(File f) {
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Cannot create file " + e.getMessage());
        }
    }

    void WriteFile(File f, String text) {
        try {
            FileWriter fileWriter = new FileWriter(f, true);
            fileWriter.write(text + "\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot write file " + e.getMessage());
        }
    }

    void ReadFile(File f) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String text;

            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Cannot read file " + e.getMessage());
        }
    }
}
