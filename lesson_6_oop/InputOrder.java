package lesson_6_oop;

import java.util.Scanner;

/**
 * InputConsole
 */
public class InputOrder {

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public static String inputStringFromConsole(String message){
        return prompt(message);
    }

    public static Integer inputIntegerFromConsole(String message){
        return Integer.parseInt(prompt(message));
    }
}