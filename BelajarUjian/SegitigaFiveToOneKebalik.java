import java.util.Scanner;

public class SegitigaFiveToOneKebalik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
