package com.company;

/**
 * @author Stainley Lebron
 * @since 11/10/19.
 */
public class SortingArray {

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 10, 2 , 1};

        for(int a : sortArray(array)){
            System.out.print(a + " ");
        }
    }

    private static int[] sortArray(int[] array) {

        for(int i = 0; i < array.length; i++) {

            for(int j = 0 ; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                    int tempStorage = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempStorage;
                }
            }
        }

        return array;
    }
}
