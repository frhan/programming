package me.farfaraway.hackerrank.algorithms.strings;

/**
 * Created by farhan on 4/12/17.
 * https://www.hackerrank.com/challenges/reduced-string
 */
public class ReducedString {

  public static void main(String[] args) {
    System.out.print(superReduce("daaabbaccd"));
  }

  private static String superReduce(String word) {
    char[] remains = new char[word.length()];
    int top = -1;

    for (char c : word.toCharArray()) {

      if (top < 0 || c != remains[top]) {
        remains[++top] = c;
      } else
        --top;
    }

    return top < 0 ? "Empty String" : new String(remains, 0, top + 1);
  }


}
