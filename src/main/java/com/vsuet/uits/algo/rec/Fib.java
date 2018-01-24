package com.vsuet.uits.algo.rec;

public class Fib {
    public static void main(String[] args){
        int stop = 377;
        int sum = 0;
        int a = 0;
        int b = 1;
        while (sum < stop) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
        }
    }
}
