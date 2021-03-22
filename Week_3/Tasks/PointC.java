package Week_3.Tasks;

public class PointC {
    public static void main(String[] args) {
        int[][] numbers = { { 5, 6, 1, 7 }, { 8, 1, 2, 9 }, { 5, 4, 7, 1 }, { 8, 3, 7, 5 } };

        for (int[] row : numbers) {
            for (int column : row) {
                System.out.print(column + " ");
            }

            System.out.println();
        }
    }
}
