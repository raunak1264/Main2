package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Sum of 3 numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter Third number: ");
        int c = sc.nextInt();
        int total = a + b + c;
        System.out.println(total);


    }
}
