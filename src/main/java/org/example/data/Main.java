package org.example.data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int A = scanner.nextInt();
        int B = scanner.nextInt();

        double result = (double) A / B;


        System.out.println("floor " + A + " / " + B + " = " + (int) Math.floor(result));

        System.out.println("ceil " + A + " / " + B + " = " + (int) Math.ceil(result));

        System.out.println("round " + A + " / " + B + " = " + Math.round(result));
        }
    }
