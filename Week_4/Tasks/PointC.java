package Week_4.Tasks;

import java.util.Scanner;

public class PointC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lowestScore = 0;
        int highestScore = 0;
        int total = 0;
        int numberOfScore;

        System.out.print("Masukkan banyaknya data nilai = ");

        numberOfScore = input.nextInt();

        int[] scores = new int[numberOfScore];

        for (int i = 0; i < scores.length; i++) {

            System.out.print("Masukkan data nilai ke-" + (i + 1) + " = ");
            scores[i] = input.nextInt();

            if (i == 0) {
                lowestScore = scores[i];
                highestScore = scores[i];
            }

            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
            } else if (scores[i] > highestScore) {
                highestScore = scores[i];
            }

            total += scores[i];
        }

        input.close();

        System.out.println("Nilai minimum = " + lowestScore);
        System.out.println("Nilai maksimum = " + highestScore);
        System.out.println("Nilai rata ratanya adalah = " + (total / numberOfScore));

    }
}
