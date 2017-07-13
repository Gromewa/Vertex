package vertex.lesson5.classwork;

import java.util.Scanner;

/**
 * Created by qw-user on 13.07.2017.
 */
public class ScannerLearn {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String text = "Welcome";
        text.equals("Welcome");
        text.compareTo("");
        text.compareToIgnoreCase("welcome");
        text.endsWith("me");
        text.startsWith("We");
        System.out.println(text.length());
        text.replace("W","w");
        String result = text.replaceAll("[W,E,L,C,O,M,E]","beer");
        System.out.println(result);



    }
}
