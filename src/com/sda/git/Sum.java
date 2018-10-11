package com.sda.git;

import java.util.Scanner;

public class Sum {
    int array = new int[]
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter 5 numbers: ");
        for (int i=0; i<array.Length; i++){
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : a){
            sum = sum + num;
        }
        System.out.println("Sum of all array elemnts is: " + sum);
    }