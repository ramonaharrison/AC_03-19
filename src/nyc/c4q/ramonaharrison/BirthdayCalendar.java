package nyc.c4q.ramonaharrison;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Access Code 2.1
 * Ramona Harrison
 * BirthdayCalendar.java
 * This class prompts the user to enter their birthday,
 * then responds with the number of days until the next birthday.
 */
public class BirthdayCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int currentYear = calendar.get(Calendar.YEAR);
        int birthdayMonth, birthdayDay, currentDayOfYear, daysUntilBirthday;
        int birthdayDayOfYear = 0;
        int feb;



        if (leapYear(currentYear)) {
            feb = 29;
        } else {
            feb = 28;
        }

        if (leapYear(currentYear + 1))


        System.out.println("Please enter your birthday:");
        System.out.println("What is the month:");
        birthdayMonth = scanner.nextInt() - 2;
        System.out.println("What is the day:");
        birthdayDay = scanner.nextInt();

        int[] months = {31, feb, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i <= birthdayMonth; i++) {
            birthdayDayOfYear += months[i];
        }

        birthdayDayOfYear += birthdayDay;
        currentDayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        if (birthdayDayOfYear > currentDayOfYear) {
            daysUntilBirthday = birthdayDayOfYear - currentDayOfYear;
            // adds a day if current year is leap year
            if (leapYear(currentYear) && currentDayOfYear < 60 && birthdayDayOfYear > 60) {
                daysUntilBirthday += 1;
            }
        } else if (birthdayDayOfYear < currentDayOfYear) {
            daysUntilBirthday = 365 - (currentDayOfYear - birthdayDayOfYear) ;
            // adds a day if next year is leap year
            if (leapYear(currentYear + 1)) {
                daysUntilBirthday += 1;
            }
        } else {
            daysUntilBirthday = 0;
            System.out.println("It's your birthday!");
        }

        System.out.println("There are " + daysUntilBirthday + " days until your birthday!");



    }

    public static boolean leapYear(int currentYear) {
        boolean leapYear;
        if (currentYear % 4 != 0) {
            leapYear = false;
        } else if (currentYear % 100 != 0) {
            leapYear = true;
        } else if (currentYear % 400 != 0) {
            leapYear = false;
        } else {
            leapYear = true;
        }
        return leapYear;
    }
}
