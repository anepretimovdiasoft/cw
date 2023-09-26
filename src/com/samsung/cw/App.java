package com.samsung.cw;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        String res = x >= 5 && x <= 10 ? "YES" : "NO";

        System.out.print(res);
    }
}
