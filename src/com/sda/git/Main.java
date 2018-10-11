package com.sda.git;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 5 numbers: ");
	    for (int index = 0; index<array.length; index++){
            array[index] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : array){
            sum = sum + num;
        }
        System.out.println("Sum of all array elemnts is: " + sum);
    }
}
