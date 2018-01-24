package com.vsuet.uits.algo.search;

public class LinearSearch {
    public void  main(String[] args) {
        int[] array = {1,2,3,4,5,9,77,55,33,10};
        search(array, 77);
    }

    public int search(int[] array, int find) {
        for (int i = 0; i != array.length; i = i + 1) {
            if (find == array[i]) {
                return i;
            }
        }

        return -777;
    }
}
