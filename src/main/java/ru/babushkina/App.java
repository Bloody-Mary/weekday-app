package ru.babushkina;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {       Scanner sc = new Scanner(System.in);
            System.out.println("Enter the day of the week in English: ");
            String dayOfWeek = sc.nextLine().toLowerCase();
            String russianDayOfWeek = translateToRussian(dayOfWeek);
            System.out.println("The day of the week in English: " + russianDayOfWeek);
    }

    private static String translateToRussian(String dayOfWeek) {
        switch (dayOfWeek) {
            case "monday":
                return "понедельник";
            case "tuesday":
                return "вторник";
            case "wednesday":
                return "среда";
            case "thursday":
                return "четверг";
            case "friday":
                return "пятница";
            case "saturday":
                return "суббота";
            case "sunday":
                return "воскресенье";
            default:
                return "неизвестный день";
        }
    }
}
