package com.tutorial;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        // int[] arrayAngka = { 1, 3, 4, 45, 6, 6, 7, 8, 5, 4, 3 };
        // printArray(arrayAngka, "arrayAngka");

        // penjumlahan antara 2 buah array
        int[] arrayAngka1 = { 3, 4, 5, 5, 6, 7, 9, 5, 5, 8, 5, 55, 1 };
        int[] arrayAngka2 = { 0, 4, 5, 3, 6, 4, 6, 4, 6, 3, 35, 5, 6 };

        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil1, "hasil 1");

        // menggabungkan 2 buah array
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }

        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }

        printArray(arrayAngka1, "array 1");
        printArray(arrayAngka2, "array 2");
        printArray(arrayHasil2, "hasil 1");

        // sorting reverse, mengurutkan tapi kebalik
        printArray(arrayAngka1, "array 1 ");
        Arrays.sort(arrayAngka1);
        printArray(arrayAngka2, "hasil 2 ");

        int[] arrayBuffer = Arrays.copyOf(arrayAngka1, arrayAngka2.length);

        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka1[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }

        printArray(arrayAngka1, "reverse");

    }

    private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    };

    private static void printArray(int[] dataArray, String message) {
        System.out.println("array " + message + " = " + Arrays.toString(dataArray));
    }
}
