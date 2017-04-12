package me.farfaraway.hackerrank.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by farhan on 4/12/17.
 * https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {

  public static void main(String [] args){

    Scanner in = new Scanner(System.in);
    // 210437958 673982045
    long a = 769082435; //in.nextLong();
    long b = 210437958; //in.nextLong();
    long c = 673982045; //in.nextLong();
    long d = 375809214;//in.nextLong();
    long e = 380564127; //in.nextLong();

    long [] longs = new long[]{a,b,c,d,e};

    long maxSum = Long.MIN_VALUE;
    long minSum = Long.MAX_VALUE;

    for (int i= 0; i<longs.length; i++){
      long sum = getSum(longs, i);

      if (sum > maxSum)
        maxSum = sum;

      if (sum < minSum)
        minSum = sum;
    }

    System.out.println(minSum+" "+maxSum);

  }

  private static long getSum(long [] longs, int expPos){
    long sum = 0;
    for (int i = 0; i< longs.length; i++){
      if (i != expPos){
        sum += longs[i];
      }
    }
    return sum;
  }

}
