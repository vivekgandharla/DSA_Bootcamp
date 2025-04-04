package com.java;
import java.util.Scanner;
//Input a year and find whether it is a leap year or not.
//Take two numbers and print the sum of both.
//Take a number as input and print the multiplication table for it.
//Take 2 numbers as inputs and find their HCF and LCM.

public class Solutions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4==0 && year % 100!=0)|| (year%400==0)){
            System.out.println("Leap year!");
        }
        else System.out.println("Not a leap year");

    }
    static class sol2{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            System.out.println(sum);
        }
    }
    static class sol3{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            int number = sc.nextInt();
            for(int i = 1;i<=10;i++){
                System.out.println(number+"x"+i+"="+(number*i));
            }
        }
    }
    static class sol4{
        public static int CalculateHCF(int a, int b){
            while (b!=0){ //10 12
                int temp = b;//12 2
                b = a % b;//2
                a = temp;//10
            }

            return a;
        }
        public static int CalculateLCM(int a, int b, int hcf){
            return Math.abs(a*b)/hcf;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int hcf = CalculateHCF(a,b);
            int lcm = CalculateLCM(a,b,hcf);
            System.out.println(hcf);
            System.out.println(lcm);

        }
    }
    //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
    static class sol5{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            while (true){
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("x")){
                    break;
                }
                try{
                    int number = Integer.parseInt(input);
                    sum = sum + number;
                }catch (NumberFormatException e){
                    System.out.println("enter the valid number!");
                }
            }
            System.out.println(sum);

        }
    }
//    Write Java programs for the following:
//    Write a program to print whether a number is even or odd, also take input from the user.
//    Take name as input and print a greeting message for that particular name.

//    Take 2 numbers as input and print the largest number.
//    Input currency in rupees and output in USD.
//    To calculate Fibonacci Series up to n numbers.
//    To find out whether the given String is Palindrome or not.
//    To find Armstrong Number between two given number.
    static class evenodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Even");
        } else System.out.println("Odd");
    }
}
static class geeting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello" + name);
    }
}
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
static class simpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the P T R");
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();
        int SI = (principal*rate*time)/100;
        System.out.println(SI);
    }
}
//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

static class operators{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Enter the operator('+','-','*','/')");
        char operator = sc.next().charAt(0);
        int result = 0;
        if(operator=='+'){
            result = a+b;
        }else if(operator == '-'){
            result = a-b;
        }else if(operator == '*'){
            result = a*b;
        }else if(operator == '/'){
            result = a/b;
        }else System.out.println("Enter the correct operator!");

        System.out.println("The result is "+ result);
    }
}


}
