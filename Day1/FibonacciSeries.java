package com.fibonacci.week1.day2;

public class FibonacciSeries {
public static void main(String[] args) {
    System.out.println("To find Fibonacci series for a given range:");
    int n = 15;
    int a = 0;
    int b = 1;
    System.out.println("The Fibonaccie series up to 8 terms:" );
    for  (a=0; a<n;){
        System.out.println(a);
        int next = a+b;
        a=b;
        b=next;

    }
}
}
