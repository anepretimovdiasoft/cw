package com.samsung.cw;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        double[] arrayDouble = new double[n];

        fillArray(array);
        fillArray(arrayDouble);

        printArray(array);
        printArray(arrayDouble);

        /*int intValue = 10;
        test(array, intValue);

        printArray(array);
        System.out.println(intValue);*/

        //TODO: что-то делаем 150 строк кода


    }

    public static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void fillArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.println(array[i]);
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) System.out.print(array[i] + ", ");
            else System.out.println(array[i]);
        }
    }

    public static int[] getArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }



    public static void test(int[] array, int intValue){

        for (int i = 0; i < array.length; i++) {
            array[i] = 9;
        }

        intValue = 9;
    }

}
