package org.aibles.exercise.service;

import java.util.ArrayList;
import java.util.List;

public class ProcessNumber {
    private static final int LIMIT_MIN_NUMBER_SEQUENCE = 10;
    private static final int LIMIT_MAX_NUMBER_SEQUENCE = 200;
    private static final int RESULT_DIVISIBILITY = 0;

    /**
     * by topic. number first is number which all number result must satisfy divisibility for it
     */
    private static final int NUMBER_DIVISIBILITY = 7;

    /**
     * by topic. number first is number which all number result must satisfy not divisibility for it
     */
    private static final int NUMBER_NOT_DIVISIBILITY = 5;


    /**
     * method take a list after print each element of list
     *
     * @param list
     */
    public static void showList(List<Integer> list) {
        if (list != null && !list.isEmpty()) {
//            example 1
            for (Integer integer : list) {
                System.out.print(integer + ", ");
            }
//            example 2
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ", ");
            }
        }
    }

    /**
     * method org.aibles.exercise.analysis a list array from 10 to 200 to find number divisibility for 7 and not divisibility for 5
     *
     * @return a list number after org.aibles.exercise.analysis
     */
    public static List<Integer> analysisNumberSequence() {
        List<Integer> results = new ArrayList<>();
        for (int i = LIMIT_MIN_NUMBER_SEQUENCE; i <= LIMIT_MAX_NUMBER_SEQUENCE; i++) {
            if ((i % NUMBER_DIVISIBILITY == RESULT_DIVISIBILITY) && (i % NUMBER_NOT_DIVISIBILITY != RESULT_DIVISIBILITY)) {
                results.add(i);
            }
        }
        return results;
    }
}
