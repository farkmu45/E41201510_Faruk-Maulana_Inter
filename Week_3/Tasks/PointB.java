package Week_3.Tasks;

import java.util.Scanner;

public class PointB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLength;

        System.out.print("Masukkan jumlah deret : ");
        arrayLength = input.nextInt();
        input.close();

        int[] randomNumbers = new int[arrayLength];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int) (Math.random() * 100) + 1;
        }

        for (int number : randomNumbers) {
            System.out.print(number + " ");
        }

    }
}
