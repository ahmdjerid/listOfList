package com.interview.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amal Soltani <amal.soltani@esprit.tn>
 *         Date: 02/08/2018
 */
public class ListPartition {


    public static List<List<Integer>> partition(List<Integer> integersLst, int size) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= integersLst.size() - 1; i = i + size) {
            int startIndex = i;
            int endIndex = size + i;

            if (endIndex > integersLst.size())
                endIndex = integersLst.size();

            List<Integer> sublist = integersLst.subList(startIndex, endIndex);
            result.add(sublist);
        }

        return result;

    }


}

