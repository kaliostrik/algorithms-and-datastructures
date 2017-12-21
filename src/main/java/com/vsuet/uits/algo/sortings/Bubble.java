package com.vsuet.uits.algo.sortings;

public class Bubble {

    public static void sort(int[] array){
        int tmp = 0;
        for (int i = 0; i < array.length ; i++){
            for (int i1 = 0; i1 < array.length - 1; i1++){
                if (array[i1] > array[i1 + 1]){
                    tmp = array[i1];
                    array[i1] = array[i1 + 1];
                    array[i1 + 1] = tmp;
                }
            }
        }
    }

}
