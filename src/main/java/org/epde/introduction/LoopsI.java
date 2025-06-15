package org.epde.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopsI {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        if (2 <= n && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                int result = n * i;
                System.out.println(n + " x " + i + " = " + result);
            }
        }

        bufferedReader.close();

    }

}
