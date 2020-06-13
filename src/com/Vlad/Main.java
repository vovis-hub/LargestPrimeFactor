package com.Vlad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int result = getLargestPrime(num);
        if (result > 1) {
            System.out.println("The largest prime factor of your number is: " + result);
        } else {
            System.out.println("Your number doesn't have a prime factor");
        }
        scanner.close();
    }
    public static int getLargestPrime(int num) {

        if (num < 0) {
            return -1;
            }
        for (int i = num; i > 1; i--) {
            if (num % i == 0) {
                for (int x = 2; x < i; x++) {
                    if (i % x == 0) {
                        break;
                     } if (x == (i - 1)) {
                        return i;
                    }
                }
            }
        }
    return -1;
    }
}

