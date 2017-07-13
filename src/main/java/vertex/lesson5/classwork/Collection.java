package vertex.lesson5.classwork;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qw-user on 13.07.2017.
 */
public class Collection {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(3);
        list.add(5);

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.size());
    }
}
