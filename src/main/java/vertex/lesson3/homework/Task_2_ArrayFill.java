package vertex.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_ArrayFill {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Введите число для заполнения массива: ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
