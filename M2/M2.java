import java.util.Scanner;

public class M2 {

    public static double checkDiscount(int harga, int qty) {
        double hargaD = harga * qty;

        if (hargaD > 2000000) {
            return hargaD * 0.98;
        } else if (hargaD > 3000000) {
            return hargaD * 0.96;
        } else if (hargaD > 5000000) {
            return hargaD * 0.95;
        }

        return hargaD;
    }

    public static void act2() {

        System.out.println("==== SELAMAT DATANG DI PROPERTI SLIBIW ====");
        System.out.println("MENU MAKANAN");
        System.out.println("1. MEJA \tRp 1.000.000");
        System.out.println("2. LEMARI \tRp 2.000.000");
        System.out.println("3. LAMPU \tRp 30.000");
        System.out.println("4. SOFA \tRp 1.500.000");
        System.out.println("5. CERMIN \tRp 150.000");

        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Properti anda? [1-5]: ");
        int chooseProperty = input.nextInt();

        System.out.print("Mau berapa kuantitas?: ");
        int qty = input.nextInt();

        double finalHarga;

        switch (chooseProperty) {
            case 1:
                finalHarga = checkDiscount(1000000, qty);
                System.out.println("Anda memesan meja sebanyak " + qty + " item");
                System.out.println("Harga: " + finalHarga);
                break;
            case 2:
                finalHarga = checkDiscount(2000000, qty);
                System.out.println("Anda memesan lemari sebanyak " + qty + " item");
                System.out.println("Harga: " + finalHarga);
                break;
            case 3:
                finalHarga = checkDiscount(30000, qty);
                System.out.println("Anda memesan lampu sebanyak " + qty + " item");
                System.out.println("Harga: " + finalHarga);
                break;
            case 4:
                finalHarga = checkDiscount(1500000, qty);
                System.out.println("Anda memesan sofa sebanyak " + qty + " item");
                System.out.println("Harga: " + finalHarga);
                break;
            case 5:
                finalHarga = checkDiscount(150000, qty);
                System.out.println("Anda memesan cermin sebanyak " + qty + " item");
                System.out.println("Harga: " + finalHarga);
                break;
            default:
                System.out.println("Salah memasukkan menu.");
        }

    }

    public static void main(String[] args) {
        act2();
    }
}
