package me.farfaraway.hackerrank.data_structure.array;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation
 */
public class LeftRotation {


    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int numberOfItems = in.nextInt();
        int rolationLenght = in.nextInt();

        int [] array = new int[numberOfItems];
        for (int i = 0; i<numberOfItems; i++){
            array[i] = in.nextInt();
        }

        for (int i = 0; i< rolationLenght ; i++) {
            if (array.length == 0 )
                return;

            int j = 0;
            int temp = array [j];
            for (j = 0; j< array.length; j++) {
                if (j != array.length -1)
                    array[j] = array[j + 1];
            }
            array[array.length -1] = temp;
        }
        for (int j = 0; j< array.length; j++)
        System.out.print(array[j] + " ");
    }

}
