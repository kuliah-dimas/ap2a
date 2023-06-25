import java.util.Scanner;

public class NO4 {
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("1. Deret bilangan ganjil");
            System.out.println("2. Deret bilangan genap");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            String pilihan = in.nextLine();

            int n;
            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan banyaknya deret: ");
                    n = in.nextInt();
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "2":
                    System.out.print("Masukkan banyaknya deret: ");
                    n = in.nextInt();
                    for (int i = 1; i <= n; i++) {
                        if (i % 2 == 1) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println("thank you for being mine.");
                    return;
                default:
                    System.out.println("Pilihan tidak ada");
            }

            System.out.println();
        }

    }
}