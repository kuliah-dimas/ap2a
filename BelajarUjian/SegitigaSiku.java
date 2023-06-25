import java.util.Scanner;

public class SegitigaSiku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga situ: ");
        int tinggi = in.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}