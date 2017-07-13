package vertex.lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by qw-user on 13.07.2017.
 */
public class DZ_Methods {
    public static void main(String[] args) {
        progselect();
    }

    private static void progselect() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose what task do you want to start?");

        int choice = scanner.nextInt();

        if (choice == 1) {
            String[] mas = {"Love", "to", "code"};
            arrAddsmile(mas);
        } else if (choice==2){
            arrRandom();
        } else if (choice == 3) {
            masRandomlength();
        } else if (choice == 4) {
            setUsers();
        } else if (choice == 5) {
            arrayOfUsers();
        } else {
            System.out.println("Make your choice");
        }


    }

    private static void arrAddsmile(String[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i] + " -:)");
        }
    }

    private static void arrRandom() {
        int[] arr = {3, 27, 42, 1};
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int value = random.nextInt(arr.length);
            arr[i] = arr[i] + value;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void masRandomlength() {
       Random rand = new Random();
       int a = rand.nextInt(100);
       int[] arr1 = new int[a];

       int index = 0;
       for (int i = 0; i < a; i++) {
            int s = rand.nextInt(100);
            arr1[i] = s;
        }
        for (int j: arr1) {
            System.out.println(arr1[index]);
            index++;
        }
    }
        private static void setUsers() {
            User alex = new User();
            User igor = new User();
            User bob = new User();

            alex.setName("Alex");
            igor.setName("Igor");
            bob.setName("Bob");

            alex.setSurname("Pupkin");
            igor.setSurname("Kolobanov");
            bob.setSurname("Vasechkin");


            User users[] = new User[3];
            users[0] = alex;
            users[1] = igor;
            users[2] = bob;

            for (int i = 0; i <users.length ; i++) {
                System.out.println("Name:" + users[i].getName());
                System.out.println("Surname: " + users[i].getSurname());
                System.out.println();
            }



        }
    private static void arrayOfUsers(){
        User pupkin = new User();
        User kostya = new User();
        User valya= new User();

        pupkin.setName("Vasya");
        kostya.setName("Petya");
        valya.setName("Kolya");

        String[] users = new String[3];
        users[0] = pupkin.getName();
        users[1] = kostya.getName();
        users[2] = valya.getName();

        System.out.println(Arrays.toString(users));
    }
}
