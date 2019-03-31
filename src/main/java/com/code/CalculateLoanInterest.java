package com.code;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers Money your:");
        int money = scanner.nextInt();
        System.out.println("Enter Numbers of Month:");
        int month = scanner.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        double interest_reat = scanner.nextDouble();
        double totalInterest = 0.0;
        for (int i=0; i < month; i++){
            totalInterest = money * (interest_reat/100)/12*3;
        }
        System.out.println("Total of Interest " + totalInterest);
    }
}
