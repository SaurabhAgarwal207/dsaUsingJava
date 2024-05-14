package com.saurabh.dsa.basicmathematics;

import java.util.Scanner;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        boolean isPrime =checkPrime(num);
        if(isPrime)
            System.out.println(num+" is prime");
        else
            System.out.println(num+" is not prime");
    }
    static boolean  checkPrime(int num){
        boolean flag=true;
        if(num==1)
            flag=false;
        for(int start=2;start*start<=num;start++){
            if(num%start==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
