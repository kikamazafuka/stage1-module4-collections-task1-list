package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int aVal = 5*(int) Math.pow(Integer.parseInt(a),2)+3;
        int bVal = 5*(int) Math.pow(Integer.parseInt(b),2)+3;
        if (aVal-bVal==0){
            return Integer.parseInt(a)-Integer.parseInt(b);
        }
        return aVal-bVal;
    }
}
