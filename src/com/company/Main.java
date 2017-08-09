package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int a = in.nextInt();
        int b = a;
        String t = "Liczba " + a + " binarnie";
        System.out.print(t + " (ZM) to: ");
        int[] table = new int[32];
        if (a < 0) {
            table[0] = 1;
            a *= -1;

        }
        int i = 0;
        while (a > 0) {
            i++;
            table[i] = a % 2;
            a /= 2;
        }
        int j = i;
        System.out.print(table[0] + ".");
        while (j > 0) {
            System.out.print(table[j]);
            j--;
        }
        System.out.println();
        int[] table1 = new int[32];
        System.out.print(t + " (ZU1) to: " + table[0] + ".");
        if (table[0] == 1) {
            for (int k = i; k > 0; k--) {
                table1[k] = table[k] == 1 ? 0 : 1;
                System.out.print(table1[k]);
            }

        } else {
            j = i;
            while (j > 0) {
                System.out.print(table[j]);
                j--;
            }
        }
        System.out.println();
        System.out.print(t + " (ZU2) to: " + table[0] + ".");

        if (b < 0) {
            boolean z = false;
            for (int k = 1; k <= i; k++) {
                if (z) {
                    table[k] = table[k] == 1 ? 0 : 1;
                } else if (table[k] == 1) {
                    z = true;
                }

            }

        }
        for (int k = i; k > 0; k--) {

            System.out.print(table[k]);

        }


    }
}
