package vertex.lesson5.classwork;

/**
 * Created by qw-user on 13.07.2017.
 */
public class CharArray {
    public static void main(String[] args) {
        String text = "Welcome to Ukraine";

        char[] chars = text.toCharArray();

        int a = 0;
        for (char elem: chars) {
            a +=(int)elem;

        }
        System.out.println(a);

//        int a = 0;
//        for (int i = 0; i < chars.length; i++) {
//            a += (int)chars[i];
//        }
//        System.out.println(a);

    }
}
