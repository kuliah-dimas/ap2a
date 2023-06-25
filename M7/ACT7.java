import java.io.*;
import java.util.*;

public class ACT7 {
    public static void main(String[] args) {
        // DEKLARASI OBJEK
        MyFile fileKu = new MyFile();
        Scanner input = new Scanner(System.in);

        // INPUT NAMA FILE
        System.out.print("Nama filenya mau apa? ");
        String namaFile = input.nextLine();

        // PATH FILE
        String path = "./";
        File f = new File(path, namaFile);

        // MEMANGGIL OBJEK UNTUK MEMBUAT FILE
        fileKu.MakeFile(f);

        // LOOPING ISI FILE
        boolean jalan = true;
        while (jalan) {
            System.out.print("\nMasukkan Isi Text : ");
            String isi = input.nextLine();
            // MEMANGGIL OBJEK UNTUK MENULIS FILE
            fileKu.WriteFile(f, isi);

            System.out.print("Mau nambah text? (y/n) : ");
            String pilihan = input.nextLine();

            if (pilihan.equalsIgnoreCase("n")) {
                jalan = false;
                break;
            }
        }

        // MEMANGGIL OBJEK UNTUK MEMBACA FILE
        fileKu.ReadFile(f);
    }
}

class MyFile {
    public void MakeFile(File f) {
        try {
            f.createNewFile();
        } catch (IOException err) {
            System.err.println("Gagal membuat : " + err.getMessage());
        }
    }

    public void WriteFile(File f, String isi) {
        try {
            FileWriter tulis = new FileWriter(f, true);
            tulis.write(isi + "\n");
            tulis.close();
        } catch (IOException err) {
            System.err.println("Gagal menulis : " + err.getMessage());
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
        } catch (IOException err) {
            System.err.println("Gagal membaca : " + err.getMessage());
        }
    }
}