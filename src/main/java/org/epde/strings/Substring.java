package org.epde.strings;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        if (start < 0 || end > S.length() || start >= end) {
            System.out.println("Error: Invalid substring indices.");
        } else {
            String substring = S.substring(start, end);
            System.out.println(substring);
        }
    }
}
