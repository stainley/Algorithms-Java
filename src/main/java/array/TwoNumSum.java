package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Stainley Lebron
 * @since 12/3/19.
 */
public class TwoNumSum {

    public int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1 ; i++) {
            int firstNum = array[i];
            for(int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if(firstNum + secondNum == targetSum) {
                    return  new int[] {array[i], array[j]};
                }
            }
        }
        return new int[0];
    }


    public int[] twoNumberSum2(int[] array, int targetSum) {
        HashMap<Integer, Boolean> nums = new HashMap<>();

        for(int num : array) {
            int possibleAnswer = targetSum - num;

            if(nums.containsKey(possibleAnswer)) {
                return new int[] {possibleAnswer, num};
            } else {
                nums.put(num, true);
            }
        }

        return new int[0];
    }

    public int[] twoNumberSum3(int[] array, int targetSum) {
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;

        while(left < right) {
            int possibleSum = array[right] + array[left];
            if(possibleSum == targetSum) {
                return new int[] {array[right], array[left]};
            } else if (possibleSum < targetSum) {
                left++;
            } else if(possibleSum > targetSum) {
                right--;
            }
        }

        return new int[0];
    }
}
