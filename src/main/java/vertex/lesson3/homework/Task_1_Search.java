package vertex.lesson3.homework;


import java.util.Arrays;
import java.util.Scanner;

public class Task_1_Search {
    public static void main(String[] args) {
        int[] arr = {4,6,8,10,27};
        System.out.println("Введите искомое число");
        Scanner scan = new Scanner(System.in);
        int find = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("present");
            } else System.out.println("upsent");
            scan.close();
        }

    }
}
