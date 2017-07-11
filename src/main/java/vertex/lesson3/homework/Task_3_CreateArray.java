package vertex.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3_CreateArray {
    public static void main(String[] args) {
        System.out.println("Введите длину массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = n;
            scan.close();
        }
        System.out.println(Arrays.toString(mas));
    }
}
