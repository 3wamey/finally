package org.example.data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        long A, B, C;


        A = scanner.nextLong();
        B = scanner.nextLong();
        C = scanner.nextLong();


        if (A >= B && A >= C) {
            if (B > C) {
                System.out.println(C + " " + A);
            } else {
                System.out.println(B + " " + A);
            }
        }


        else if (B >= A && B >= C) {
            if (A > C) {
                System.out.println(C + " " + B);
            } else {
                System.out.println(A + " " + B);
            }
        }


        else if (C >= A) {
            if (A > B) {
                System.out.println(B + " " + C);
            } else {
                System.out.println(A + " " + C);
            }
        }


        }
    }
