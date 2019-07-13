package com.company;

/**
 * @author Stainley Lebron
 * @since 2019-07-06.
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[lastUnsortedIndex])
                    swap(intArray, i, lastUnsortedIndex);
            }
        }

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
