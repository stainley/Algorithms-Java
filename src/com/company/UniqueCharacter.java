package com.company;

/**
 * @author Stainley Lebron
 * @since 11/9/19.
 */

//Input : abcd10jk
//Output : true

//Input : hutg9mnd!nk9
//Output : false
public class UniqueCharacter {

    public static void main(String[] args) {
        String input1 = "abcd10jk";
        String input2 = "hutg9mnd!nk9";

        System.out.println(hasUniqueCharacters(input2));

    }

    private static boolean hasUniqueCharacters(String data) {
        for(int i = 0; i < data.length(); i++) {
            for(int j = i + 1; j < data.length(); j++) {
                if(data.charAt(i) == data.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }


}
