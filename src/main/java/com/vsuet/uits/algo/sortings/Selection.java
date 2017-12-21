package com.vsuet.uits.algo.sortings;

public class Selection {

    public static void sort(int[] array) {
        int tmp = 0;
        for (int i = 0; i < array.length - 1; i++){
            for (int i1 = i + 1; i1 < array.length; i1++){
                if(array[i1] < array[i]){ i = i1; }
            }

            tmp = array[i];
            array[i] = array[i];
            array[i] = tmp;
        }
    }

}
