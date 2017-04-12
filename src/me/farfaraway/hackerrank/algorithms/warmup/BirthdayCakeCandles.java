package me.farfaraway.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by farhan on 4/12/17.
 */
public class BirthdayCakeCandles {

  public static void main(String [] args){
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    int height[] = new int[n];
    for(int height_i=0; height_i < n; height_i++){
      height[height_i] = in.nextInt();
    }

    int max = Integer.MIN_VALUE;
    int count = 0;
    for (int i = 0; i< height.length; i++){

      if (height[i] == max)
      {
        count++;
        continue;
      }

      if (height[i] > max){
        count = 1;
        max = height[i];
      }
    }

    System.out.print(count);

  }
}
