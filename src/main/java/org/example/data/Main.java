package org.example.data;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* V. Comparison   */

        Scanner scanner = new Scanner(System.in);

        int A, B;

        char C;

        A = scanner.nextInt();
        C = scanner.next().charAt(0);
        B = scanner.nextInt();


        if (C == '<') {
            if (A < B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (C == '>') {
            if (A > B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        } else if (C == '=') {
            if (A == B) {
                System.out.println("Right");
            } else {
                System.out.println("Wrong");
            }
        }


        }
    }
