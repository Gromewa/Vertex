package vertex.lesson4.classwork;

public class Methods {
    public static void main(String[] args) {
        just();
        kill("Bobobo");
        System.out.println(loop());
        pal(35);
        System.out.println(count(5, 6));
        bool(false);
        gettwo(12,34);
        System.out.println(booltwo(25, 25));
    }

    private static boolean booltwo(int l, int r) {
        if (l==r) {
            return true;
        } else {
            return false;
        }

    }

    private static void gettwo(int v, int c) {
        System.out.println(v + c);
    }

    private static int bool(boolean name) {
        if (name) {
            return 1;
        } else {
            return -1;
        }
    }

    private static int count(int a, int b) {
        return a + b;
    }

    private static void just() {
        System.out.println("Just");
    }

    private static void kill(String text) {
        System.out.println(text);
    }

    private static int loop() {
        return 12;
    }

    private static int pal(int number) {

        return number;
    }
}
