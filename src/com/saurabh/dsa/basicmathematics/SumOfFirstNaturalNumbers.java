package com.saurabh.dsa.basicmathematics;

import java.util.Scanner;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num");
        int num= scan.nextInt();
        System.out.println(findSum(num));
    }
    static int findSum(int num){
        return (num*(num+1))/2;
    }
}
