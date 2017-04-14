package me.farfaraway.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference
 */

public class DiagonalDifference {

  static int getSec(int[][] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i][a.length - 1 - i];
    }
    return sum;
  }

  static int getPri(int[][] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++) {
      sum += a[i][i];
    }
    return sum;
  }


  public static void main(String[] args) {
//    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//    int a[][] = new int[n][n];
//    for(int a_i=0; a_i < n; a_i++){
//      for(int a_j=0; a_j < n; a_j++){
//        a[a_i][a_j] = in.nextInt();
//      }
//    }
    int[][] a = new int[][]{{11, 2, 4},
            {4, 5, 6},
            {10, 8, -12}
    };

    System.out.print(Math.abs(getPri(a) - getSec(a)));
  }
}
