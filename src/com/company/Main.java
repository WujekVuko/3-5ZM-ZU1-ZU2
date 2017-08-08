package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę:");
        int a = in.nextInt();
        System.out.print("Liczba " + a + " binarnie (ZM) to: ");
        int[] table = new int[32];
        if (a < 0) {
            table[0] = 1;

        }
        int i = 0;
        for (int f = a; f > 0; ) {
            i++;
            table[i] = f % 2;
            f /= 2;

        }
        int j = i;
        System.out.print(table[0] + ".");
        while (j > 0) {
            System.out.print(table[j]);
            j--;
        }
        System.out.println();
        System.out.print("Liczba " + a + " binarnie (ZU1) to: ");
        System.out.print(table[0] + ".");
        if (table[0] == 1) {
            for (int k = i; k > 0; k--) {
                if (table[k] == 1) System.out.print("0");
                else if (table[k] == 0) System.out.print("1");
            }
        } else {
            j = i;
            while (j > 0) {
                System.out.print(table[j]);
                j--;
            }
        }
        System.out.println();
        System.out.print("Liczba " + a + " binarnie (ZU2) to: ");
        System.out.print(table[0] + ".");

        for (int k = j; k > 0; k--) {
            if (table[k] == 1) System.out.print("0");
            else if (table[k] == 0) System.out.print("1");
        }

    }
}
