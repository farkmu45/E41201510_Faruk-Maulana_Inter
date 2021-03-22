package Week_3.Tasks;

import java.util.Scanner;

import Week_3.Tasks.StringAlignUtils.Alignment;

public class PointD {
    public static void main(String[] args) {
        String customer;
        String[] prizes = { "1 buah mug cantik", "2 voucher game", "1 voucher diskon" };

        Scanner input = new Scanner(System.in);
        int totalPrice = 0;

        StringAlignUtils alignCenter = new StringAlignUtils(45, Alignment.CENTER);
        System.out.println("---------------------------------------------");
        System.out.print(alignCenter.format("Kharisma Agung Plaza"));
        System.out.print(alignCenter.format("Promo Belanja Berhadiah"));
        System.out.print(alignCenter.format("Khusus Pembelian 5 Barang Pertama"));
        System.out.print(alignCenter.format("Dengan harga minimum Rp 10000,00"));
        System.out.println("---------------------------------------------");
        System.out.print("\nMasukkan nama pembeli : ");
        customer = input.nextLine();
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan harga barang ke-" + i + "      : ");
            totalPrice += input.nextInt();
        }

        input.close();
        System.out.println("\nTotal pembelian atas nama " + customer + " adalah Rp " + totalPrice);

        if (totalPrice >= 10000) {
            System.out.println("Selamat...");
            System.out.println("Anda mendapat hadiah " + prizes[(int) (Math.random() * 2) + 0]);
        }

        System.out.println("---------------------------------------------");

        System.out.print(alignCenter.format("Terima Kasih"));
        System.out.print(alignCenter.format("Anda sudah berbelanja di Kharisma Agung Plaza"));
    }
}
