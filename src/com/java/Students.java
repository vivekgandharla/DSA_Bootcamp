package com.java;

import java.util.Scanner;

class details {
    String Name,course,College;
    int roll_no;
    char section;

    void displayInfo(){
        System.out.println("Student "+Name+"Opted for "+course+"in "+College+"College");
    }
}
public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        details ofStudent = new details();
        System.out.println("Enter the Name of the Student: ");
        ofStudent.Name = sc.nextLine();
        System.out.println("Enter the Course of the Student: ");
        ofStudent.course = sc.nextLine();
        System.out.println("Enter the College of the Student: ");
        ofStudent.College = sc.nextLine();
        ofStudent.displayInfo();
    }
}

