//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
package com.company;

public class Main {

    public static void main(String[] args) {
        int p = 1;
        int j = 0;
        for (int i = 0; i <= 53; i++) {
            if (p <= i) {
                p = i + 2;
                System.out.print(" " + p);
            }
else if (i==0) System.out.print(" " + p);
        }
    }
}
