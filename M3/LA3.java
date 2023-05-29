import java.util.Scanner;

public class LA3 {
    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        int next;
        String list = "List Fibonacci: ";

        Scanner input = new Scanner(System.in);
        System.out.print("Input angka: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            list += n1 + " ";
            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
        System.out.println(list);
    }
}
