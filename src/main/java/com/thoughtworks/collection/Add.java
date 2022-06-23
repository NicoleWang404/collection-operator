package com.thoughtworks.collection;


import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        int sum = 0;
        if (leftBorder < rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {

        int sum = 0;
        if (leftBorder < rightBorder) {

            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        } else {
            for (int i = rightBorder; i <= leftBorder; i++) {

                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }
        return sum;
    }


    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i) * 3 + 2;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {


        for (int i = 0; i < arrayList.size(); i++) {
            int n = arrayList.get(i);
            if (n % 2 == 1) {
                arrayList.set(i, n * 3 + 2);
            }
        }
        return arrayList;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            int n = arrayList.get(i);
            if (n % 2 == 1) {
                sum += n * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        double median = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                resultList.add(arrayList.get(i));
            }
        }
        int index = resultList.size();
        if (resultList.size() % 2 == 0) {
            median = (resultList.get((index / 2) - 1) + resultList.get(index / 2)) / 2.0;
        } else {
            median = resultList.get((index - 1) / 2);
        }

        return median;
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        double average = 0;
        int sum = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                resultList.add(arrayList.get(i));
            }
        }
        for (int i = 0; i < resultList.size(); i++) {
            sum += resultList.get(i);
        }
        average = sum / resultList.size();
        return average;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {

        for (int i = 0; i < arrayList.size(); i++) {

            if (arrayList.get(i) % 2 == 0 && arrayList.get(i).equals(specialElment)) {
                return true;
            }
        }
        return false;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        Set set = new HashSet<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                set.add(arrayList.get(i));
            }
        }
        List<Integer> resultList = new ArrayList<>(set);
        return resultList;
    }


    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        List<Integer> oddList = new ArrayList<>();
//        List<Integer> evenList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                //evenList.add(arrayList.get(i));
                resultList.add(arrayList.get(i));
                //Collections.sort(evenList);
            }
        }
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 != 0) {
                    resultList.add(arrayList.get(i));
                    //Collections.reverse(oddList);
                    //resultList.addAll(oddList);
                }
            }

        return resultList;
    }


    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() - 1; i++) {

            Integer result = 3 * (arrayList.get(i) + arrayList.get(i + 1));
            resultList.add(result);
        }
        return resultList;
    }
}

