package lv.acodemy;

public class exampleClass {
    public static void main(String[] args) {
    sayHello();
    greet("Chris");
    greet("John");
    greet("Alen");
    greet("Alex");
    System.out.println(add(30, 60));
    int x = add(30, 90);
    System.out.println(x);

    add

    }
    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(double a, double b) {
        return a + b;
    }
}


