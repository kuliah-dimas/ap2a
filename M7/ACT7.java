import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ACT7 {
    public static void main(String[] args) {
        MyFile filekuMyFile = new MyFile();
        Scanner input = new Scanner(System.in);

        System.out.print("Nama file mau apa?: ");
        String namaFile = input.nextLine();

        String path = "./fileku";
        File f = new File(path, namaFile);

        filekuMyFile.MakeFile(f);

        boolean jalan = true;
        while (jalan) {
            System.out.print("Masukkan isi text: ");
            String isi = input.nextLine();

            filekuMyFile.WriteFile(f, isi);

            System.out.print("Mau nambah text? (y/n): ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                jalan = false;
                break;
            }
        }
    }
}

class MyFile {
    public void MakeFile(File f) {
        try {
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Gagal membuat: " + e.getMessage());
        }
    }

    public void WriteFile(File f, String isi) {
        try {
            FileWriter tulis = new FileWriter(f, true);
            tulis.write(isi + "\n");
            tulis.close();
        } catch (Exception e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
    }

    public void ReadFile(File f) {
        try {
            BufferedReader baca = new BufferedReader(new FileReader(f));
            String isiFile;

            while ((isiFile = baca.readLine()) != null) {
                System.out.println(isiFile);
            }

            baca.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca:" + e.getMessage());
        }
    }
}
