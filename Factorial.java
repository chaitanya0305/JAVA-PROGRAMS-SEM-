package com.company;

import java.util.*;
import java.lang.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact =1;
        System.out.println("FACTORIAL OF A NUMBER");
        System.out.println("ENTER VALUE WHOSE FACTORIAL HAS TO BE CALCULATED");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact * i ;
        }
        System.out.printf("FACTORIAL OF %d IS : %d \n",n,fact);

    }
}
