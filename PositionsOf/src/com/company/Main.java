package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrix = readMatrix(scan);

        int numberToSearch = Integer.parseInt(scan.nextLine());
        boolean isFound = false;

        for (int row = 0; row < matrix.length; row++) {
            for (int colomn = 0; colomn < matrix[row].length; colomn++) {
                if (matrix[row][colomn] == numberToSearch){
                    System.out.println(row + " " + colomn);
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
    private static int[][] readMatrix(Scanner scan){
        int[] columnsAndRows = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int columns = columnsAndRows[1];
        int rows = columnsAndRows[0];

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            int[] array = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = array;

        }
        return matrix;
    }
}
