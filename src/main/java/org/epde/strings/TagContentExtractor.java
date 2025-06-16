package org.epde.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine().trim());
        Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");

        for (int i = 0; i < testCases && i < 100; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);

            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }
        }

        scanner.close();
    }
}
