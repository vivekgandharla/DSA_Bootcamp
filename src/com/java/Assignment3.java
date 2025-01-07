package com.java;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //largest of 3?
//        int max = a;
//        if(b > max ){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
    static class countN {
        public static void main(String[] args) {
            int N = 33453;
            int count = 0;
            while (N>0){
                int rem = N%10;
                if(rem==5){
                    count++;
                }
                N = N/10;
            }
            System.out.println(count);
        }
    }
    static class Reverse{
        public static void main(String[] args) {
            int n = 14314;
            int ans = 0;
            while (n>0){
                int rem = n%10;
                n/=10;
                ans = ans *10+rem;
            }
            System.out.println(ans);
        }
    }
    static class Calculator{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ans = 0;
            while (true) {
                System.out.println("Enter the operator: ");
                char op = sc.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                    //input 2 nums;
                    System.out.print("Enter 2 numbers: ");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    }
                    if (op == '-') {
                        ans = num1 - num2;
                    }
                    if (op == '*') {
                        ans = num1 * num2;
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            ans = num1 / num2;
                        }
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                }else if (op == 'x' || op == 'X') {
                        break;
                    }
                else{
                    System.out.println("Invalid operation!!");
                    }
                    System.out.println(ans);

                }
            }
        }}