package com.company;

/**
 * @author Stainley Lebron
 * @since 11/14/19.
 */
public class Fibonacci {

    // O(n) Time complexity  O(1) Time spaces
    private static int findFibOpt(int number) {
        int[] temp = {0, 1};
        int nextFib = 0;
        int counter = 2;

        while(counter <= number) {
            nextFib = temp[0] + temp[1];
            temp[0] = temp[1];
            temp[1] = nextFib;
            counter += 1;
        }
        return number < 1? temp[1] : temp[0];
    }

    public static void main(String[] args) {
        System.out.println(findFibOpt(4));
    }
}
