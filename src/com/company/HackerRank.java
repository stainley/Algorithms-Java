package com.company;

/**
 * @author Stainley Lebron
 * @since 2019-07-21.
 */
public class HackerRank {
    public static void main(String[] args) {
        String A = "hello";
        String B = "java";

        int length = A.length() + B.length();
        System.out.println(length);
        System.out.println(A.compareTo(B) > 0 ? "Yes": "No");
        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
    }
}
