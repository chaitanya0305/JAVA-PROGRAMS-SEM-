package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program for Fibonacci series");
        System.out.println("ENTER VALUE OF F");
        int f = sc.nextInt();
        int n1 = 0;
        int n2 = 1;

        for(int i=0;i<f;i++){
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            temp = n1 ;
            System.out.println(n1);
        }
    }
}
