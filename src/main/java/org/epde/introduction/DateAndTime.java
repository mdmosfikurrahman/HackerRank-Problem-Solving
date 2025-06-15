package org.epde.introduction;

import java.io.IOException;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Scanner;

class Result {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);
        int month = s.nextInt();// Integer.parseInt();

        int day = s.nextInt();// Integer.parseInt(firstMultipleInput[1]);

        int year = s.nextInt();// Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        System.out.println("result : " + res);
        s.close();
    }
}
