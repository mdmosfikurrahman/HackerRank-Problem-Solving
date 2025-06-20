package org.epde.strings;

import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int stringLength = A.length() + B.length();

        System.out.println(stringLength);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String beforeSpace = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String afterSpace = Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(beforeSpace + " " + afterSpace);
    }
}
