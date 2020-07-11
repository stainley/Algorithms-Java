package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Stainley Lebron
 * @since 7/11/20.
 */
public class Anagrams {

    public int sherlockAndAnagrams(String s) {
        Map<String, Integer> hashtable = new HashMap<>();
        int total = 0;

        for( int i = 0; i < s.length(); i++) {
            for( int j = i + 1; j <= s.length(); j++ ){
                String sub = s.substring(i, j);

                char[] temp = sub.toCharArray();
                Arrays.sort(temp);
                sub = new String(temp);

                if(hashtable.containsKey(sub)) {
                    int oldValue = hashtable.get(sub);
                    total += oldValue;
                    hashtable.put(sub, ++oldValue);

                } else {
                    hashtable.put(sub, 1);
                }
            }
        }

        return total;
    }
}
