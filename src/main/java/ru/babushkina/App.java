package ru.babushkina;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название дня недели на английском: ");
        String dayOfWeek = scanner.nextLine().toLowerCase();
        String russianDayOfWeek = translateToRussian(dayOfWeek);
        System.out.println("Название дня недели на русском: " + russianDayOfWeek);
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
