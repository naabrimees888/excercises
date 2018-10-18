package com.sda.homeworks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Enter one number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;

        }
        System.out.println("Factorial of inserted number is: " + factorial);
    }
}
