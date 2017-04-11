package me.farfaraway.hackerrank.data_structure.array;

/**
 * https://www.hackerrank.com/challenges/2d-array
 */

public class Problem2DArray {

    private static int getHourglassOfSubMatrix(int [][] matrix , int i , int j){
        int value = 0;
        for (int k = i; k < i + 3 ;  k++){
            for (int l = j; l< j+3 ; l++){
                if ((k == i + 1) && ( l != j + 1))
                    continue;
                value += matrix[k][l];
            }
        }
        return value;
    }

    public static void main(String [] args){

        int [][] matrix = { {1, 1, 1, 0, 0, 0},
                            {0, 1, 0, 0, 0, 0},
                            {1, 1, 1, 0, 0, 0},
                            {0, 0, 2, 4, 4, 0},
                            {0, 0, 0, 2, 0, 0},
                            {0, 0, 1, 2, 4, 0}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4 ; j++){
                int subMax = getHourglassOfSubMatrix(matrix,i,j);
                max = subMax > max ? subMax : max;
            }
        }

        System.out.print("Maximum value:"+max);
    }

}
