package vertex.lesson4.classwork;

/**
 * Глобальная переменная, в классе, В методе локальная
 */
public class Global_Zminna {
    private static String name = "Alex";

    public static void main(String[] args) {
        System.out.println(name);
        name = "Bob";
        print();
    }
    private static void print() {
        System.out.println(name);
    }
}
