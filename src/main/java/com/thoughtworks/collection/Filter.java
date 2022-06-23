package com.thoughtworks.collection;


import java.lang.reflect.Array;
import java.util.*;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                resultList.add(array.get(i));
            }
        }
        return resultList;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> tripleList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 3 == 0) {
                tripleList.add(array.get(i));
            }
        }
        return tripleList;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> commonList = new ArrayList<>();
        for (int i = 0; i < firstList.size(); i++) {
            for (int j = 0; j < secondList.size(); j++) {
                if (firstList.get(i) == secondList.get(j)) {
                    commonList.add(firstList.get(i));
                }
            }
        }
        return commonList;
    }

    public List<Integer> getDifferentElements() {

        List<Integer> resultList = new ArrayList<>(array.size());
        for (int i = 0; i < array.size(); i++) {
            Integer result = array.get(i);
            if (!resultList.contains(result)) {
                resultList.add(result);
            }
        }
        return resultList;
    }
}