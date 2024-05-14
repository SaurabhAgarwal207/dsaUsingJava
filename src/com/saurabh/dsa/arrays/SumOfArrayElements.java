package com.saurabh.dsa.arrays;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        int sum=0;
        for(int j=0;j<size;j++){
            sum=sum+arr[j];
        }
        System.out.println("sum of all array elements is : "+sum);
    }
}
