package com.company;

import java.util.ArrayList;

/**
 * @author Stainley Lebron
 * @since 11/9/19.
 */
public class SumTwoArrays {


    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> total = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {

            sum = nums[i] + nums[i + 1];

            if(target == sum) {
                break;
            }

        }

        return new int[0];
    }
}
