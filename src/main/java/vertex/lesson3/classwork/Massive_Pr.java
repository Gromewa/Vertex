package vertex.lesson3.classwork;


import java.util.Arrays;

public class Massive_Pr {
    public static void main(String[] args) {
        int[] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 10;
        }
        System.out.println(Arrays.toString(mas));

        int[] arr = new int[10];

        for (int i = 0; i < mas.length; i++) {
            arr[i] = mas[i];
        }
        System.out.println(Arrays.toString(arr));

        int[] itog = new int[mas.length + arr.length];

        for (int i = 0; i < mas.length; i++) {
            itog[i] = mas[i];
        }
        int index = 0;
        for (int i = mas.length; i < itog.length; i++) {
            itog[i] = arr[index];
            index++;
        }
        System.out.println(Arrays.toString(itog));
    }


}
