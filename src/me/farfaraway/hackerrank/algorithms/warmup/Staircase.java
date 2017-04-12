package me.farfaraway.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    stair(n);

  }

  public static void stair(final int n) {
    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= (n - i); j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("#");
      }

      System.out.print("\n");

    }
  }

}
