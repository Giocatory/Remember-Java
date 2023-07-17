package Types;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        Random rnd = new Random();
        // Одномерный массив
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // new int[10]
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[rnd.nextInt(arr.length - 1)] + " ");
        }

        // многомерный массив
        int[][] arr2 = new int[4][];
        for (int i = 0; i < 4; i++) {
            arr2[i] = new int[5];
            for (int j = 0; j < 5; j++) {
                arr2[i][j] = rnd.nextInt(10);
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        /*
            6 6 0 0 0
            3 9 9 1 6
            1 9 0 3 3
        */
    }
}
