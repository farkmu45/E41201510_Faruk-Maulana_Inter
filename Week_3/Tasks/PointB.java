package Week_3.Tasks;

import java.util.Scanner;

public class PointB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRows;

        System.out.print("Masukkan jumlah deret : ");
        numberOfRows = input.nextInt();
        input.close();

        int[] randomArray = new int[numberOfRows];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100) + 1;
        }

        for (int number : randomArray) {
            System.out.print(number + " ");
        }

    }
}
