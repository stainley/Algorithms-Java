package com.company;

/**
 * @author Stainley Lebron
 * @since 11/10/19.
 */
public class RotateLeftArray {

    public static void main(String[] args) {
        //int[] array = {1, 2, 3, 4, 5};
        int[] array = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51 };
        //int rotate = 4;
        int rotate = 10;

        int[] newArr = rotLeft(array, rotate);

        for(int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotated = new int[n];

        System.arraycopy(a, d, rotated, 0,  n - d);

        System.arraycopy(a, 0, rotated,n - d, d);

        return rotated;
    }

}
