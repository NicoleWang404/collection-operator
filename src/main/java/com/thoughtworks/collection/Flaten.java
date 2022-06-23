package com.thoughtworks.collection;


import java.util.ArrayList;
import java.util.List;

public class Flaten {

    Integer[][] array;

    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
//        for (int i = 0; i < array.length; i++) {
//            Integer[] result = (Integer[]) array[i];
//           // for (Integer)
//        }
//      return null;
        List<Integer> resultList = new ArrayList<>();
        //s.forEach(resultList::addAll);
        return resultList;


    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        return null;
    }
}
