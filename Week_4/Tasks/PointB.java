package Week_4.Tasks;

import Week_3.Tasks.StringAlignUtils;
import Week_3.Tasks.StringAlignUtils.Alignment;

public class PointB {
    public static void main(String[] args) {
        StringAlignUtils alignCenter = new StringAlignUtils(30, Alignment.CENTER);
        String numbers = "";

        System.out.print(alignCenter.format("Do_While"));

        System.out.print(alignCenter.format("Bilangan kelipatan 2 (1-100)"));

        System.out.println("==============================");

        for (int i = 1; i < 100; i *= 2) {
            numbers = numbers + i + "  ";
        }

        System.out.print(alignCenter.format(numbers));
    }
}
