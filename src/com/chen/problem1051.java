package com.chen;

import java.util.Scanner;

public class problem1051 {
    private static int maxLen(int arr[],int m,int n){
        if(m>=n) return 100;
        int res = arr[m]-1;
        for(int i=0;i+m+1<n;i++){
            res = Math.max(res, arr[i+m+1]-arr[i]-1);
        }
        res = Math.max(res, 100-arr[n-m-1]);
        return res;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-->0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(maxLen(arr, m, n));
        }
        sc.close();
    }
}
