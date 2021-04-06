package Week_3.Tasks;

import java.util.Scanner;

import Utils.StringAlignUtils;
import Utils.StringAlignUtils.Alignment;

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

        for (int i = 0; i < menu.length; i++) {
            System.out.println("  "+(i+1) + ". "+menu[i]);
        }

        System.out.println("--------------------");

        System.out.print("Masukkan nama pembeli : ");
        customer = input.nextLine();

        System.out.print("\nSilahkan masukkan pilihan anda : ");
        choice = input.nextInt();
        input.close();
        System.out.println("Minuman yang anda pesan adalah " + menu[choice - 1]);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + customer + " telah berkunjung di Cafe Ceria");
    }
}
