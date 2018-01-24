package com.vsuet.uits.algo.rec;

public class Fac {
    public static void main(String[] args){
        int ret = 1;
        int n = 12;
        for (int i = 1; i <= n; ++i) ret *= i;
        System.out.println(ret);
    }
}
