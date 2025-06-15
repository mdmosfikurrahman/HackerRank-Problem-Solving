package org.epde.introduction;

import java.util.Scanner;

public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if (1 <= n && n <= 100) {
            if (n % 2 != 0) {
                System.out.println("Weird");
            } else if (n <= 5) {
                System.out.println("Not Weird");
            } else if (n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

    }

}
