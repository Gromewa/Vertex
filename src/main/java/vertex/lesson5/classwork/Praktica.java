package vertex.lesson5.classwork;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by qw-user on 13.07.2017.
 */
public class Praktica {
    public static void main(String[] args) {

        yourchoice();

    }

    private static void yourchoice() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make your choice");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                trDoubleInt();
                break;
            case 2:
                trIntDouble();
                break;
            case 3:
                trStringInt();
                break;
            case 4:
                trIntString();
                break;
            case 5:
                trDoubleString();
                break;
            case 6:
                trStringDouble();
                break;
            case 7:
                trMix();
                break;
            case 8:
                sqrt();
                break;
            case 9:
                randomArr();
            case 10:
                randomArrPrint();
            case 11:
                fillmasRandom();
            case 12:
                copyArrRandom();

        }


        }

    private static void trDoubleInt() {
        double doubleValue = 1.8;
        int value = (int) doubleValue;
        System.out.println(value);
    }

    private static void trIntDouble() {
        int a = 56;
        double b = (double) a;
        System.out.println(b);
    }

    private static void trStringInt() {
        String a = "12";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }

    private static void trIntString() {
        int a = 24;
        String b = String.valueOf(a);
        System.out.println(b);
    }

    private static void trDoubleString() {
        double a = 24.4555;
        String b = String.valueOf(a);
        System.out.println(b);
    }


    private static void trStringDouble() {
        String a = "42.54";
        double b = Double.parseDouble(a);
        System.out.println(b);
    }

    private static void trMix() {
        double a = 56.00007;
        int b = (int) a;
        String c = String.valueOf(b);
        System.out.println(c);
    }

    private static void sqrt() {
        double a = 12;
        double b = 34;
        int value = (int) Math.sqrt(a+b);
        System.out.println(value);
    }

    private static void randomArr() {
        Random rand = new Random();

        for (int i = 0; i < 100 ; i++) {
            int x = rand.nextInt(100);
            if (x%2==0) {
                System.out.println("Число " + x + " четное ");
            } else if (x%1==0) {
                System.out.println("Число " + x + " нечетное ");
            }
        }
        }

    private static void randomArrPrint() {
        Random random = new Random();

        for (int i = 1; i < 100; i++) {

            int x =random.nextInt(100);

            switch (x) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println(x);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    System.out.println(x);
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                    System.out.println(x);


            }

        }
    }

    private static void fillmasRandom() {
        int[] array = new int[20];
        Random rand1 = new Random();

        for (int i = 0; i < array.length ; i++) {
            int a = rand1.nextInt(100);
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));

    }

    private static void copyArrRandom() {
        int[] mas1 = {2,10,15,3};

        int[] arr2 = new int[mas1.length];
        int[] arr3 = new int[mas1.length];

        Random rob = new Random();
        int i = rob.nextInt(mas1.length - 1);
        int element = mas1[i];

        Random randomMas = new Random();
        int choiceMas = 1 + randomMas.nextInt(1);

        switch (choiceMas) {
            case 1:
                Random elem = new Random();
                int index = elem.nextInt(arr2.length -1);
                arr2[index] = element;
                break;
            case 2:
                Random elem2 = new Random();
                int index2 = elem2.nextInt(arr3.length -1);
                arr3[index2] = element;
                break;


        }
    }


    }








