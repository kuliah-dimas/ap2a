import java.util.PrimitiveIterator;
import java.util.Scanner;

public class SegitigaSikuKebalikV2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga situ: ");
        int tinggi = in.nextInt();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= tinggi + 1 - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
