package ca_yachtordicepoker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CA_YachtOrDicePoker {

    public static class diceCombinations {

        public static List<Integer> pair = Arrays.asList(2);
        public static List<Integer> full_house = Arrays.asList(2, 3);
        public static List<Integer> yacht = Arrays.asList(5);
        public static List<Integer> two_pairs = Arrays.asList(2, 2);
        public static List<Integer> three = Arrays.asList(3);
        public static List<Integer> four = Arrays.asList(4);
        public static List<Integer> small_straight = Arrays.asList(1, 2, 3, 4, 5);
        public static List<Integer> big_straight = Arrays.asList(2, 3, 4, 5, 6);
    }

    public static void main(String[] args) {
        String input_str = "2 3 4 5 6\n"
                + "4 6 5 1 5\n"
                + "2 3 4 5 1\n"
                + "6 2 3 6 6\n"
                + "2 3 4 5 1\n"
                + "2 3 4 5 6\n"
                + "1 5 3 3 1\n"
                + "5 6 3 2 5\n"
                + "2 3 4 5 1\n"
                + "5 3 5 5 4\n"
                + "6 3 1 1 5\n"
                + "4 6 4 4 3\n"
                + "2 3 4 5 6\n"
                + "2 3 4 5 1\n"
                + "2 3 4 5 1\n"
                + "5 4 4 4 6\n"
                + "2 3 4 5 1\n"
                + "4 5 1 3 2\n"
                + "2 3 4 5 6\n"
                + "2 2 6 4 2\n"
                + "2 3 4 5 1\n"
                + "5 5 1 1 1\n"
                + "3 3 3 3 3\n"
                + "3 5 6 6 3\n"
                + "2 3 4 5 1\n"
                + "2 5 5 2 6\n"
                + "5 2 5 6 3\n"
                + "6 6 6 6 6\n"
                + "2 3 4 5 6\n"
                + "2 3 6 6 3\n"
                + "6 2 4 3 3\n"
                + "2 4 5 5 5";
        String[] str_arr = input_str.split("\\s");
//        System.out.println(str_arr.length);
        int j = 0;
        int[] array;
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < str_arr.length; i += 5) {

            List<Integer> l = new ArrayList<Integer>();
            List<Integer> res = new ArrayList<Integer>();
            while (j < 5) {
                l.add(Integer.parseInt(str_arr[i + j]));
                j++;
            }
            Collections.sort(l);

            int count = 0;
            for (int k = 1; k < 7; k++) {
                count = Collections.frequency(l, k);
                if (count > 1) {
                    res.add(count);
                }
            }
            Collections.sort(res);

            if (res.equals(diceCombinations.pair)) {
                System.out.println("pair");
            }
            if (res.equals(diceCombinations.full_house)) {
                System.out.println("full-house");
            }
            if (res.equals(diceCombinations.yacht)) {
                System.out.println("yacht");
            }
            if (res.equals(diceCombinations.two_pairs)) {
                System.out.println("two-pairs");
            }
            if (res.equals(diceCombinations.three)) {
                System.out.println("three");
            }
            if (res.equals(diceCombinations.four)) {
                System.out.println("four");
            }
            if (l.equals(diceCombinations.small_straight)) {
                System.out.println("small-straight");
            }
            if (l.equals(diceCombinations.big_straight)) {
                System.out.println("big-straight");
            }

            count = 0;
            l = null;
            j = 0;

        }

    }
}
