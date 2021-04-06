package Week_4.Tasks;

import Utils.StringAlignUtils;
import Utils.StringAlignUtils.Alignment;

public class PointB {
    public static void main(String[] args) {
        StringAlignUtils alignCenter = new StringAlignUtils(30, Alignment.CENTER);
        String numbers = "";
        String numbers2 = "";

        System.out.print(alignCenter.format("Do_While"));

        System.out.print(alignCenter.format("Bilangan kelipatan 2 (1-100)"));

        System.out.println("==============================");

        for (int i = 1; i < 100; i *= 2) {
            numbers = numbers + i + "  ";
        }

        for (int i = 0; i < 100; i+=2) {
            numbers2 = numbers2 + i + "  ";
        }

        System.out.print(alignCenter.format(numbers));
        System.out.println();
        System.out.print(alignCenter.format(numbers2));
    }
}
