package me.farfaraway.hackerrank.algorithms.strings;

import java.util.Scanner;

public class CamelCase {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();

    String[] split = s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])");

    for (int i = 0; i < split.length; i++) {
      System.out.println((i + 1) + "." + " " + split[i]);
    }
    System.out.println(split.length);
  }
}

