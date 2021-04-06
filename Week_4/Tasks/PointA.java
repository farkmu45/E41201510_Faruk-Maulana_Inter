package Week_4.Tasks;

import Utils.Input;

public class PointA {
    public static void main(String[] args) {
        Input input = new Input();
        int startLimit;
        int endLimit;

        System.out.print("Masukkan batas awal = ");
        startLimit = input.getNumber();

        System.out.print("Masukkan batas akhir = ");
        endLimit = input.getNumber(startLimit);

        for (int i = startLimit; i <= endLimit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
