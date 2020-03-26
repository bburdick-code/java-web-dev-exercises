package exercises;

import java.util.HashMap;
import java.util.Map;

public class CountingChar {

    public static void main(String[] args) {
        HashMap<Character, Integer> count = new HashMap<>();

        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] array = phrase.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (!count.containsKey(array[i])) {
                count.put(array[i], 1);
            } else {
                count.put(array[i], count.get(array[i]) + 1);
            }
        }

        for ( Map.Entry<Character,Integer> c : count.entrySet()) {
            System.out.println( c.getKey() + ": " + c.getValue());
        }
    }
}


