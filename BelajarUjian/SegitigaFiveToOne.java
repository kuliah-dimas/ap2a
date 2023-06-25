import java.util.Scanner;

public class SegitigaFiveToOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
