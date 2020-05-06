package array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Stainley Lebron
 * @since 12/3/19.
 */

// O(n^2) Time complexity || O(n) Time spaces
public class Fibonacci {
    public int calculateFib(int value) {
        if(value == 1) {
            return 0;
        } else if (value == 2) {
            return 1;
        }

        return calculateFib(value - 2) + calculateFib(value - 1);
    }

    //O(n) Time complexity || O(n) Time spaces
    public int calculateFib2(int value) {
        HashMap<Integer, Integer> memoize = new HashMap<>();
        memoize.put(1, 0);
        memoize.put(2, 1);
        return calculateFib2(value, memoize);
    }
    public int calculateFib2(int n, HashMap<Integer, Integer> memoize) {
        if(memoize.containsKey(n)) {
            return memoize.get(n);
        } else {
            memoize.put(n, calculateFib2(n - 1, memoize) + calculateFib2(n - 2, memoize));
            return memoize.get(n);
        }
    }

    // O(n) time complexity || O(1) Time spaces
    public int calculateFib3(int n) {
        int[] temp = {0, 1};
        int counter = 3;

        while(counter <= n) {
            int nextFib = temp[0] + temp[1];
            temp[0] = temp[1];
            temp[1] = nextFib;
            counter++;
        }
        return n > 1 ? temp[1] : temp[0];
    }
}
