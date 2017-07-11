package vertex.lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task_2_ArrayFill {
    public static void main(String[] args) {
        System.out.println("Введите число для заполнения массива: ");
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = scan.nextInt();
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = arr[0];
            scan.close();
        }
        System.out.println(Arrays.toString(arr));
    }
}
