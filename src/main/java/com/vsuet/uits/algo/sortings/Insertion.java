package com.vsuet.uits.algo.sortings;

public class Insertion {

    public static void sort(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length; i++){
            for (int i1 = 0; i1 < array.length; i1++){
                if (array[i1] < array[i]){
                    tmp = array[i];
                    array[i] = array[i1];
                    array[i1] = tmp;
                }
            }
        }
    }

}