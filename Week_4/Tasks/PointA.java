package Week_4.Tasks;

import java.util.Scanner;

public class PointA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startLimit;
        int endLimit;

        System.out.print("Masukkan batas awal = ");
        startLimit = input.nextInt();

        System.out.print("Masukkan batas akhir = ");
        endLimit = input.nextInt();

        input.close();

        for (int i = startLimit; i <= endLimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
