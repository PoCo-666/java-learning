package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] numbers;
        String[] names;

        int number[];
        String name[];

        numbers = new int[5]; // [0, 0, 0, 0, 0]
        names = new String[3];

        System.out.println(numbers);
        System.out.println(names);

        int[] numberz = {1, 2, 3, 4, 5};
        String[] namez = {"Johnn", "Alex", "Bob"};

        System.out.println(namez[2]);
        namez[2] = "Jerry";
        System.out.println(Arrays.toString(namez));

        String myName = "Jhonn";
        System.out.println(myName.charAt(0));
    }
}
