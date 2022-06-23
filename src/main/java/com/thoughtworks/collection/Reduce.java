package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    public int getMaximum() {
        int max = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (max < arrayList.get(i)) {
                max = arrayList.get(i);
            }
        }
        return max;
    }

    public double getMinimum() {
        int min = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (min > arrayList.get(i)) {
                min = arrayList.get(i);
            }
        }
        return min;
    }

    public double getAverage() {
        double average = 0;
        double sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        average = sum / (arrayList.size());
        return average;
    }

    public double getMedian() {
        double median = 0;
        int index = arrayList.size();
        if (arrayList.size() % 2 == 0) {
            median = (arrayList.get((index / 2) - 1) + arrayList.get(index / 2)) / 2.0;
        } else {
            median = arrayList.get((index - 1) / 2);
        }
        return median;
    }

    public double getOrderedMedian() {
        double median = 0;
        int index = arrayList.size();
        if (arrayList.size() % 2 == 0) {
            median = (arrayList.get((index / 2) - 1) + arrayList.get(index / 2)) / 2.0;
        } else {
            median = arrayList.get((index - 1) / 2);
        }
        return median;
    }

    public int getFirstEven() {
        List<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int result = arrayList.get(i);
            if (result % 2 == 0) {
                evenList.add(result);
            }
        }
        int firstEven = evenList.get(0);
        return firstEven;
    }

    public int getIndexOfFirstEven() {
        List<Integer> iList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                iList.add(i);
            }
        }
        return iList.get(0);
    }

    public boolean isEqual(List<Integer> arrayList) {
//        for (int i = 0; i < ; i++) {


        return false;
    }


    public int getLastOdd() {
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            int result = arrayList.get(i);
            if (result % 2 == 1) {
                oddList.add(result);
            }
        }
        return oddList.get(oddList.size() - 1);
    }

    public int getIndexOfLastOdd() {
        List<Integer> iList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 1) {
                iList.add(i);
            }
        }
        return iList.get(iList.size()-1);
    }
}
