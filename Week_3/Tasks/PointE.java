package Week_3.Tasks;

import java.util.Scanner;

import Week_3.Tasks.StringAlignUtils.Alignment;

public class PointE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringAlignUtils alignCenter = new StringAlignUtils(20, Alignment.CENTER);

        String[] menu = { "Soft Drinks", "Mix Juice", "Nescafe", "Soda Milk", "Tea" };
        String customer;
        int choice;

        System.out.print(alignCenter.format("CAFE CERIA"));
        System.out.print(alignCenter.format("ANEKA MINUMAN"));

        System.out.println("--------------------");
        System.out.print(alignCenter.format("SPECIAL MENU :"));
        System.out.println("  1. Soft Drinks");
        System.out.println("  2. Mix Juice");
        System.out.println("  3. Nescafe");
        System.out.println("  4. Soda Milk");
        System.out.println("  5. Tea");

        System.out.println("--------------------");

        System.out.print("Masukkan nama pembeli : ");
        customer = input.nextLine();

        System.out.print("\nSilahkan masukkan pilihan anda : ");
        choice = input.nextInt();

        System.out.println("Minuman yang anda pesan adalah " + menu[choice - 1]);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + customer + " telah berkunjung di Cafe Ceria");
    }
}
