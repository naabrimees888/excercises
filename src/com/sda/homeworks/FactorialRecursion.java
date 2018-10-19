package com.sda.homeworks;

import java.util.Scanner;

public class FactorialRecursion {
    import java.util.Scanner;

    public class FactorialRecursion {

        public static void main(String[] args) {
            System.out.println("Enter one number: ");
            Scanner scanner = new Scanner(System.in);
            long fact = scanner.nextInt();
            System.out.println(factorial((int) fact));
        }
        public static int factorial (int fact){
            if (fact == 0) return 1;
            return factorial(fact - 1) * fact;
        }
    }
}
