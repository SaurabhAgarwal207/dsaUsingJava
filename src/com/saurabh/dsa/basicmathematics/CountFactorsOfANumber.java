package com.saurabh.dsa.basicmathematics;

import java.util.Scanner;

public class CountFactorsOfANumber {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int count=0;
        for(int start=1;start*start<=num;start++){
            if(num%start==0){
                if(start==num/start)
                    count++;
                else
                    count=count+2;
            }
        }
        System.out.println("Total Factors : "+count);
    }
}
